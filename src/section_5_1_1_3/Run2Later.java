package section_5_1_1_3;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Run2Later {
	private static Timer timer = new Timer();
	static public class MyTask1 extends TimerTask {
		public void run() {
			try {
				System.out.println("1 begin run! Time is: " + new Date());
				Thread.sleep(20000);
				System.out.println("1 end run! Time is: " + new Date());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} 
	static public class MyTask2 extends TimerTask {
		public void run() {
			System.out.println("2 begin run! Time is: " + new Date());
			System.out.println("Running! Time is: " + new Date());
			System.out.println("2 end run! Time is: " + new Date());
		}
	}
	public static void main(String[] args) {
		try {
			MyTask1 task1 = new MyTask1();
			MyTask2 task2 = new MyTask2();
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString1 = "2017-11-10 11:15:00";
			String dateString2 = "2017-11-10 11:15:10";
			Date dateRef1 = sdf1.parse(dateString1);
			Date dateRef2 = sdf2.parse(dateString2);
			System.out.println("String1 timer: " + dateRef1.toLocaleString() + " Current TIME: " + new Date().toLocaleString());
			System.out.println("String2 timer: " + dateRef2.toLocaleString() + " Current TIME: " + new Date().toLocaleString());
			timer.schedule(task1, dateRef1);
			timer.schedule(task2, dateRef2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
