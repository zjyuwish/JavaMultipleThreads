package section4_1_2;

public class ThreadA extends Thread {
	private MyService service;
	public ThreadA(MyService service) {
		super();
		this.service = service;
	}
	public void run() {
		service.methodA();
	}
}
