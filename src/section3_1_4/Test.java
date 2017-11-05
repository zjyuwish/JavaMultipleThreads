package section3_1_4;

public class Test {
	public static void main(String[] args) {
		Object lock = new Object();
		ThreadA a = new ThreadA(lock);
		a.start();
		ThreadB b = new ThreadB(lock);
		b.start();
	}
}
