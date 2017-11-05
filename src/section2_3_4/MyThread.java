package section2_3_4;

public class MyThread extends Thread {
	volatile public static int count;
	private static void addCount() {
		for(int i = 0; i < 100; i++) {
			count++;
		}
		//count++是非原子的 volatile保证不了原子性
		System.out.println("count=" + count);
	}
	public void run() {
		addCount();
	}
}
