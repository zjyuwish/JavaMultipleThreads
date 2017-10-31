package section1_7_8;

public class MyThread extends Thread {
	public void run() {
		while(true) {
			if(this.isInterrupted()) {
				System.out.println("Stopped!");
				return;
			}
			System.out.println("timer=" + System.currentTimeMillis());
		}
	}
}
