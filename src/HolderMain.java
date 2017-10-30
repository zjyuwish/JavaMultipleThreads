//设想一下场景
//有2个线程 A,B
//A做的操作：Holder holder = new Holder(42);
//B做的操作：
//if(holder != null) {
//　　holder.assertSantiy();
//}
//对于线程A的操作，jvm执行时的步骤：1.栈里生成holder引用，2.执行构造函数，在堆里生成Holder的内存空间，并且给n赋值为42，3.把holder指向堆里生成的内存空间
//问题是：上面的1，2，3步骤不是按照1，2，3的顺序执行的，执行引擎对指令重排序后，可能会按照1，3，2的顺序执行，也可能是别的顺序
//结果：这样就导致当holder指向了堆里的内存空间时（这时holder不是null了），但是构造函数执行尚未完成，n还没有被赋值为42。
//
//对于线程B的操作,assertSanity()方法编译后的指令如下：
//public void assertSanity();
//flags: ACC_PUBLIC
//Code:
//stack=3, locals=1, args_size=1
//0: aload_0 
//1: getfield #2 // Field n:I
//4: aload_0 
//5: getfield #2 // Field n:I
//8: if_icmpeq 21
//11: new #3 // class java/lang/AssertionError
//14: dup 
//15: ldc #4 // String This statment is false.
//17: invokespecial #5 // Method java/lang/AssertionError."<init>":(Ljava/lang/Object;)V
//20: athrow 
//21: return 
//LineNumberTable:
//line 14: 0
//line 15: 11
//line 17: 21
//LocalVariableTable:
//Start Length Slot Name Signature
//0 22 0 this Lo1/Holder;
//}
//
//注意看绿色部分的指令，
//第一步：1: getfield #2 // Field n:I
//取得n的值
//第二部：5: getfield #2 // Field n:I
//取得n的值
//也就是说，在执行比较指令if_icmpeq之前，要让比较的两个数都进栈，然后做比较
//那么，既然要进栈2次，也就可以推导出，当线程B操作第一步getField时，n没有被线程A赋值，那么这个n是0，之后，线程A修改了n的值，第二次进栈时，n的值已经是修改后的42了
//这样，就会导致栈顶2个slot中的数，一个0，一个是42，必然会导致8: if_icmpeq的结果为真

//解决方案:
//把n定义成final，并且在声明Holder时，使用volatile关键字
//final能保证Holder在构造方法执行时，不会被执行引擎重排序，也就不会出现holder指向了Holder构造产生的内存空间，但是构造方法没有执行完成的情况（n没有被赋值）
//volatile保证了在外部程序中，线程A和线程B对Holder的更新状态是随时可见的


public class HolderMain {
	public Holder holder;
	
	public void threadTest() {
		for(int i = 0; i < 1000; i++) {

			new Thread(new Runnable() {
				public void run() {
					if(holder != null) {
						holder.assertSanity();
					}
				}
			}).start();
			
			new Thread(new Runnable() {
				public void run() {
				    holder = new Holder(42);
				}
			}).start();
			
		}
	}
	public static void main(String args[]) {
		HolderMain h = new HolderMain();
		h.threadTest();
		
	}
}
