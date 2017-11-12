package section7_6_2;

public class MyThreadGroup extends ThreadGroup {
	public MyThreadGroup (String name) {
		super(name);
	}
	public void uncaughtException(Thread t, Throwable e) {
		//t:出现异常的线程对象
	    super.uncaughtException(t, e);
		this.interrupt();
	}
}
