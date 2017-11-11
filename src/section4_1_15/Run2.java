package section4_1_15;

public class Run2 {
	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		MyThreadA myThreadA = new MyThreadA(service);
		myThreadA.start();
		Thread.sleep(3000);
		MyThreadB myThreadB = new MyThreadB(service);
		myThreadB.start();
	}
}
