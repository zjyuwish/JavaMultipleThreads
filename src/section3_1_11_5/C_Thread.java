package section3_1_11_5;

public class C_Thread extends Thread{
	private C r;
	
	public C_Thread(C r) {
		super();
		this.r = r;
	}
	public void run() {
		while(true) {
			r.popService();
		}
	}
}
