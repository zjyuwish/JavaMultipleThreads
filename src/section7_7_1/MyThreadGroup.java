package section7_7_1;

public class MyThreadGroup extends ThreadGroup{
	public MyThreadGroup(String name) {
		super(name);
	}
	public void uncaughtException(Thread t, Throwable e) {
		super.uncaughtException(t, e);
		System.out.println("Thread Group Error processing");
		e.printStackTrace();
	}
}
