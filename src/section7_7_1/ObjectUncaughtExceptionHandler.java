package section7_7_1;
import java.lang.Thread.UncaughtExceptionHandler;
public class ObjectUncaughtExceptionHandler implements UncaughtExceptionHandler{
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("Object Error Processing");
		e.printStackTrace();
	}
}
