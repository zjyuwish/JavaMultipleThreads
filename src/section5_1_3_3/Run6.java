package section5_1_3_3;
import java.text.*;
import java.util.*;
public class Run6 {
	private static Timer timer = new Timer();
	static public class MyTask1 extends TimerTask {
		public void run() {
			System.out.println("1 begin! Time: " + new Date());
			System.out.println("1 end! Time: " + new Date());
		}
	}
	public static void main(String[] args) {
		try {
			MyTask1 task1 = new MyTask1();
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString1 = "2017-11-10 14:51:00";
			Date dateRef1 = sdf1.parse(dateString1);
			System.out.println("String1 Time: " + dateRef1.toLocaleString() + " Current Time: " + new Date().toLocaleString());
			timer.scheduleAtFixedRate(task1, dateRef1, 5000);
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
