package section2_2_5;

public class ThreadB extends Thread {
	private ObjectService service;
	public ThreadB(ObjectService service) {
		super();
		this.service = service;
	}
	public void run() {
		super.run();
		service.serviceMethodB();
	}
}
