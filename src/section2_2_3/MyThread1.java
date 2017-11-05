package section2_2_3;

public class MyThread1 extends Thread {
	private Task task;
	public MyThread1(Task task) {
		super();
		this.task = task;
	}
	public void run() {
		super.run();
		task.doLongTimeTask();
	}
}
