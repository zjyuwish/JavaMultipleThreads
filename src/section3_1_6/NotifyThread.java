package section3_1_6;

public class NotifyThread extends Thread {
	private Object lock;
	public NotifyThread(Object lock) {
		super();
		this.lock = lock;
	}
	public void run() {
		synchronized(lock) {
			lock.notify();
		}
	}
}
