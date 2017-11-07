package section3_2_1;

public class Test {
	public static void main(String[] args) {
		try {
			MyThread threadTest = new MyThread();
			threadTest.start();
			threadTest.join(1000);
			System.out.println("aaaaaaaaa");
			System.out.println("bbbbbbbbb");
			System.out.println("ccccccccc");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
