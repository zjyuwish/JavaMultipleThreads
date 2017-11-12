package section7_7_1;
import java.util.ArrayList;
public class Run2 {
	public static void main(String args[]) {
		MyThreadGroup group = new MyThreadGroup("My Thread Group");
		MyThread myThread = new MyThread(group, "My Thread");
		//myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
		//myThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
		myThread.start();
	}
}
