package section4_1_2;

public class ThreadAA extends Thread {
	private MyService service;
	public ThreadAA(MyService service) {
		super();
		this.service = service;
	}
	public void run() {
		service.methodA();
	}
}
