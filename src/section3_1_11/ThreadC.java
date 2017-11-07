package section3_1_11;

public class ThreadC extends Thread{
	private C r;
	
	public ThreadC(C r) {
		super();
		this.r = r;
	}
	
	public void run() {
		while(true) {
			r.getValue();
		}
	}
}
