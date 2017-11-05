package section2_2_3;

public class MyThread2 extends Thread {
	private Task task;
	public MyThread2(Task task) {
		super();
		this.task = task;
	}
	public void run() {
		super.run();
		task.doLongTimeTask();
	}
}
