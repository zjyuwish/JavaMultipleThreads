package section3_1_6;

public class ThreadA extends Thread{
	private Object lock;
	public ThreadA(Object lock) {
		super();
		this.lock = lock;
	}
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}
}
