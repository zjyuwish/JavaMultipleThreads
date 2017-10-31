package section1_11;
//thread为守护线程，主线程为非守护进程，当主线程结束时，守护线程也终止。
public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.setDaemon(true);
			thread.start();
			Thread.sleep(5000);
			System.out.println("I stopped when main thread stopped, stop printing");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
