package section3_3_4;

public class Run {
	public static void main(String[] args) {
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println("in Main: " + Tools.t1.get());
				Thread.sleep(100);
			}
			Thread.sleep(5000);
			ThreadA a = new ThreadA();
			a.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
