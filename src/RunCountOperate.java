
public class RunCountOperate {
	public static void main(String[] args) {
		CountOperate c = new CountOperate();
		//run函数里: t1:this是当前的对象,this关键字去调用继承自父类Thread的方法getName, isAlive; c:this是Thread.currntThread
		Thread t1 = new Thread(c);
		t1.setName("A");
		t1.start();
//		c.setName("A");
//		c.start();
	}
}
