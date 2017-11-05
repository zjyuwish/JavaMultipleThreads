package section2_1_2;

public class ThreadA extends Thread {
	private HasSelfPrivateNum numRef;
	public ThreadA(HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}
	public void run() {
		super.run();
		numRef.addI("a");
	}
}
