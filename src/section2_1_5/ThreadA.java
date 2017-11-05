package section2_1_5;

public class ThreadA extends Thread {
	private publicVar publicVar;
	public ThreadA(publicVar publicVar) {
		super();
		this.publicVar = publicVar;
	}
	public void run() {
		super.run();
		publicVar.setValue("B", "BB");
	}
}
