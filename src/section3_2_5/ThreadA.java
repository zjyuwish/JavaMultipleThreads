package section3_2_5;


public class ThreadA extends Thread {
	private ThreadB b;
	public ThreadA(ThreadB b) {
		super();
		this.b = b;
	}
	public void run() {
		try {
			synchronized(b) {
				b.start();
				b.join();
				Thread.sleep(6000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
