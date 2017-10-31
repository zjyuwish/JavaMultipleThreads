package section1_7_5;
//暴力停止，最好不用，stop方法已经deprecated了
public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(8000);
			thread.stop();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
