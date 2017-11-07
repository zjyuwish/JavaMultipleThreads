package section3_2_5;

public class ThreadB extends Thread {
	public void run() {
		try {
			System.out.println("b run begin timer=" + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("b run end timer=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	synchronized public void bService() {
		System.out.println("print bService timer=" + System.currentTimeMillis());
	}
}
