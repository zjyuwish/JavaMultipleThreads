package section5_1_2_4;
import java.util.*;
import java.text.*;

public class Run2 {
	static public class MyTaskA extends TimerTask {
		public void run() {
			System.out.println("A start! Time is: " + new Date());
			this.cancel();
		}
	}
	static public class MyTaskB extends TimerTask {
		public void run() {
			System.out.println("B start! Time is: " + new Date());
		}
	}
	public static void main(String args[]) {
		try {
			MyTaskA taskA = new MyTaskA();
			MyTaskB taskB = new MyTaskB();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2014-10-12 09:10:00";
			Timer timer = new Timer();
			Date dateRef = sdf.parse(dateString);
			System.out.println("String time: " + dateRef.toLocaleString() + " Current time: " + new Date().toLocaleString());
			timer.schedule(taskA, dateRef, 4000);
			timer.schedule(taskB, dateRef, 4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
