package section3_1_3;

public class Test1 {
	public static void main(String[] args) {
		try {
			String newString = new String("");
			newString.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
