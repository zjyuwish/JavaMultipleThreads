package section4_1_3;

public class ThreadA extends Thread{
	private MyService service;
	public ThreadA(MyService service) {
		super();
		this.service = service;
	}
	public void run() {
		service.await();
	}
}
