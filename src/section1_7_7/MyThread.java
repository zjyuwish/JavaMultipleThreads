package section1_7_7;

public class MyThread extends Thread {
	private SynchronizedObject object;
	public MyThread(SynchronizedObject object) {
		super();
		this.object = object;
	}
	public void run() {
		object.printString("b", "bb");
	}
}
