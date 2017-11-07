package section3_1_10;

public class ThreadAdd extends Thread {
	private Add p;
	public ThreadAdd(Add p) {
		super();
		this.p = p;
	}
	public void run() {
		p.add();
	}
}
