package section3_1_3;

public class MyThread1 extends Thread {
	private Object lock;
	public MyThread1(Object lock) {
		super();
		this.lock = lock;
	}
	public void run() {
		try {
			synchronized (lock) {
				System.out.println("start wait time=" +System.currentTimeMillis());
				lock.wait();
				System.out.println("end wait time=" + System.currentTimeMillis());
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
