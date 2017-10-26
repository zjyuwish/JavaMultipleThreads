//ThreadLocal提供set get 等访问接口
//ThreadLocal<T>在每一个线程上创建一个T的副本，副本之间彼此独立，互不影响


//initialValue  
//protected T initialValue()返回此线程局部变量的当前线程的“初始值”。线程第一次使用 get() 方法访问变量时将调用此方法，但如果线程之前调用了 set(T) 方法，则不会对该线程再调用 initialValue 方法。通常，此方法对每个线程最多调用一次，但如果在调用 get() 后又调用了 remove()，则可能再次调用此方法。   
//  
//该实现返回 null；如果程序员希望线程局部变量具有 null 以外的值，则必须为 ThreadLocal 创建子类，并重写此方法。通常将使用匿名内部类完成此操作。   
//  
//返回：  
//返回此线程局部变量的初始值  
//--------------------------------------------------------------------------------  
//get  
//public T get()返回此线程局部变量的当前线程副本中的值。如果变量没有用于当前线程的值，则先将其初始化为调用 initialValue() 方法返回的值。   
//  
//返回：  
//此线程局部变量的当前线程的值  
//--------------------------------------------------------------------------------  
//set  
//public void set(T value)将此线程局部变量的当前线程副本中的值设置为指定值。大部分子类不需要重写此方法，它们只依靠 initialValue() 方法来设置线程局部变量的值。   
//  
//参数：  
//value - 存储在此线程局部变量的当前线程副本中的值。  
//--------------------------------------------------------------------------------  
//remove  
//public void remove()移除此线程局部变量当前线程的值。如果此线程局部变量随后被当前线程读取，且这期间当前线程没有设置其值，则将调用其 initialValue() 方法重新初始化其值。这将导致在当前线程多次调用 initialValue 方法。  

public class Task implements Runnable {  
    private static ThreadLocal<Double> value = new ThreadLocal<Double>(){  
        @Override  
        protected Double initialValue() {  
            return Math.random();  
        }  
    };  
      
    public void run() {  
    	//value.set(20.0);
        System.out.println(value.get());  
    }  
      
    public static void main(String[] args) {  
        Task t = new Task();  
        Thread td1 = new Thread(t);  
        Thread td2 = new Thread(t);  
        td1.start();  
        td2.start();  
    }  
}  