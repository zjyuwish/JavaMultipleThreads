package section4_1_3;

public class Run {
	public static void main(String args[]) {
		try {
			MyService service = new MyService();
			ThreadA a = new ThreadA(service);
			a.start();
			Thread.sleep(1000);
			System.out.println("Main Thread");
			ThreadA b = new ThreadA(service);
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
