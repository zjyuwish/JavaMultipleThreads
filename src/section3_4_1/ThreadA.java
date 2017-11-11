package section3_4_1;

public class ThreadA extends Thread {
	public void run() {
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println("In ThreadA: " + Tools.t1.get());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
