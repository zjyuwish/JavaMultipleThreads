package section7_1_1;

public class MyThread extends Thread{
	public MyThread() {
		System.out.println("Constructor Method: " + Thread.currentThread().getState());
	}
	public void run() {
		System.out.println("Run: " + Thread.currentThread().getState());
	}
}
