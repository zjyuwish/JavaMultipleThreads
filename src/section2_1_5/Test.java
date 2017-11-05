package section2_1_5;

public class Test {
	public static void main(String[] args) {
		try {
			publicVar publicVarRef = new publicVar();
			ThreadA thread = new ThreadA(publicVarRef);
			thread.start();
			Thread.sleep(200);
			publicVarRef.getValue();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
