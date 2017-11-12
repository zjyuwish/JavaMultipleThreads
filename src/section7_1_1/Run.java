package section7_1_1;

public class Run {
	public static void main(String args[]) {
		try {
			MyThread t = new MyThread();
			System.out.println("Main1: " + t.getState());
			Thread.sleep(1000);
			t.start();
			Thread.sleep(1000);
			System.out.println("Main2: " + t.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
