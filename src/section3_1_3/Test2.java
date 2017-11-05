package section3_1_3;

public class Test2 {
	public static void main(String[] args) {
		try {
			String lock = new String();
			System.out.println("syn upside");
			synchronized(lock) {
				System.out.println("syn first line");
				lock.wait();
				System.out.println("code after wait");
			}
			System.out.println("code after syn");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
