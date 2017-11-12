package section7_7_1;

public class MyThread extends Thread {
	private String num = "a";
	public MyThread() {
		super();
	}
	public MyThread(ThreadGroup group, String name) {
		super(group, name);
	}
	public void run() {
		int numInt = Integer.parseInt(num);
		System.out.println("Thread print: " + (numInt + 1));
	}
}
