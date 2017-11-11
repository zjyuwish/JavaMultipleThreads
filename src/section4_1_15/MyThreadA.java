package section4_1_15;

public class MyThreadA extends Thread {
	private Service service;
	public MyThreadA(Service service) {
		super();
		this.service = service;
	}
	public void run() {
		service.waitMethod();
	}
}
