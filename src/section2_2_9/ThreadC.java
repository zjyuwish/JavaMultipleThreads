package section2_2_9;

public class ThreadC extends Thread {
	private Service service;
	public ThreadC(Service service) {
		super();
		this.service = service;
	}
	public void run() {
		service.printC();
	}
}
