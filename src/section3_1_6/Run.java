package section3_1_6;

public class Run {
	public static void main(String args[]) throws InterruptedException {
		Object lock = new Object();
		ThreadA a = new ThreadA(lock);
		a.start();
		ThreadB b = new ThreadB(lock);
		b.start();
		ThreadC c = new ThreadC(lock);
		c.start();
		Thread.sleep(1000);
		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();
		
	}
}
