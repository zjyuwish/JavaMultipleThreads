
public class CountOperate extends Thread{
	public CountOperate() {
		System.out.println("CountOperate--begin");
		System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("this.isAlive()=" + this.isAlive());
		System.out.println("CountOperate--end");
	}
	public void run() {
		//super.start();
		System.out.println("run--begin");
		System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("this.isAlive()=" + this.isAlive());
		System.out.println("Thread.currentThread() == this : " + (Thread.currentThread() == this));  
		System.out.println("run--end");
	}
}
