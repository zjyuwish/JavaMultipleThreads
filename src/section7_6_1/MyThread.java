package section7_6_1;

public class MyThread extends Thread {
	private String num;
	public MyThread(ThreadGroup group, String name, String num) {
		super(group, name);
		this.num = num;
	}
	public void run() {
		int numInt = Integer.parseInt(num);
		while(true) {
			System.out.println("Infinite Cycle: " + Thread.currentThread().getName());
		}
	}
}
