package section3_1_6;

public class ThreadC extends Thread{
	private Object lock;
	public ThreadC(Object lock) {
		super();
		this.lock = lock;
	}
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}
}
