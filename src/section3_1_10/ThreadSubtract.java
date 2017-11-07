package section3_1_10;

public class ThreadSubtract extends Thread {
	private Subtract r;
	public ThreadSubtract(Subtract r) {
		super();
		this.r = r;
	}
	public void run() {
		r.subtract();
	}
}
