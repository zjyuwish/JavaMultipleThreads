package section4_1_2;

public class ThreadBB extends Thread{
	private MyService service;
	public ThreadBB(MyService service) {
		super();
		this.service = service;
	}
	public void run() {
		service.methodB();
	}
}
