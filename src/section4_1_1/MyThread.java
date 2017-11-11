package section4_1_1;

public class MyThread extends Thread{
	private MyService service;
	public MyThread(MyService service) {
		super();
		this.service = service;
	}
	public void run() {
		service.testMethod();
	}
}
