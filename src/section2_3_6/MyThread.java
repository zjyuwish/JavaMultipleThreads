package section2_3_6;

public class MyThread extends Thread {
	private MyService myService;
	public MyThread(MyService myService) {
		super();
		this.myService = myService;
	}
	public void run() {
		myService.addNum();
	}
}
