package section4_2_1;

public class ThreadB extends Thread {
	private Service service;
	public ThreadB(Service service) {
		super();
		this.service = service;
	}
	public void run() {
		service.read();
	}
}
