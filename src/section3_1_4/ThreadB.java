package section3_1_4;

public class ThreadB extends Thread {
	private Object lock;
	public ThreadB(Object lock) {
		super();
		this.lock = lock;
	}
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}
}
