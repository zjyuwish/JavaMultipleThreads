package section7_7_1;

public class Run1 {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		//myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
		myThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
		myThread.start();
	}
}
