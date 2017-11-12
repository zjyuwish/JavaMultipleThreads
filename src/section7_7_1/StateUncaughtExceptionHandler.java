package section7_7_1;
import java.lang.Thread.UncaughtExceptionHandler;
public class StateUncaughtExceptionHandler implements UncaughtExceptionHandler{
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("Static Error processing");
		e.printStackTrace();
	}
}
