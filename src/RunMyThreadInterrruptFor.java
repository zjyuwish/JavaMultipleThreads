
public class RunMyThreadInterrruptFor {
	public static void main(String[] args) {
		try {
			MyThreadInterruptForCatch thread = new MyThreadInterruptForCatch();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch(InterruptedException e) {
			System.out.println("main catch");
		}
		System.out.println("end!");
	}
}
