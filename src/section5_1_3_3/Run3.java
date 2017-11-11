package section5_1_3_3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run3 {
	private static Timer timer = new Timer();
	private static int runCount = 0;
	static public class MyTask1 extends TimerTask {
		public void run() {
			try {
				System.out.println("1 begin running! Time: " + new Date());
				Thread.sleep(2000);
				System.out.println("1 end running! Time: " + new Date());
				runCount++;
				if(runCount == 5) {
					timer.cancel();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		try {
			MyTask1 task1 = new MyTask1();
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString1 = "2014-10-10 00:00:00";
			Date dateRef1 = sdf1.parse(dateString1);
			System.out.println("String1: " + dateRef1.toLocaleString() + " Current Time: " + new Date().toLocaleString());
			timer.scheduleAtFixedRate(task1, dateRef1, 3000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
