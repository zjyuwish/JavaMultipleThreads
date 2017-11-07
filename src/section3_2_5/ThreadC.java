package section3_2_5;

public class ThreadC extends Thread {
	private ThreadB threadB;
	public ThreadC(ThreadB threadB) {
		super();
		this.threadB = threadB;
	}
	public void run() {
		threadB.bService();
	}
}
