package section3_2_6;

public class Run {
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			System.out.println("main start" + System.currentTimeMillis());
			a.start();
			b.start();
			b.join(5000);
			//b.join(6000);
			System.out.println("main end" + System.currentTimeMillis());
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
