package section3_3_2_1;
//验证隔离性
public class Run {
	public static void main(String[] args) {
		try {
			ThreadA a = new ThreadA();
			a.start();
			Thread.sleep(1000);
			ThreadB b = new ThreadB();
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
