package section2_1_6;

public class MyThread extends Thread {
	public void run() {
		Service service = new Service();
		service.service1();
	}
}
