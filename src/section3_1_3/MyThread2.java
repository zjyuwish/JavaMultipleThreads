package section3_1_3;

public class MyThread2 extends Thread {
	private Object lock;
	public MyThread2(Object lock) {
		super();
		this.lock = lock;
	}
	public void run() {
		synchronized(lock) {
			System.out.println("start notify time=" + System.currentTimeMillis());
			lock.notify();
			System.out.println("end notify time=" + System.currentTimeMillis());
		}
	}
}
