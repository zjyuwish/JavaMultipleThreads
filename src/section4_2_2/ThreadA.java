package section4_2_2;

public class ThreadA extends Thread{
	private Service service;
	public ThreadA(Service service) {
		super();
		this.service = service;
	}
	public void run() {
		service.write();
	}
}
