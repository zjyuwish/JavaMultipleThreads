
public class RunMyThreadInterruptSleep {
	public static void main(String[] args) {
	//	try {
			MyThreadInterruptSleep thread = new MyThreadInterruptSleep();
			thread.start();
			//Thread.sleep(200);
			thread.interrupt();
//		}
//		catch(InterruptedException e) {
//			System.out.println("main catch");
//			e.printStackTrace();
//		}
		System.out.println("end!");
	}
}
