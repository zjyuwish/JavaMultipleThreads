
public class Holder{
	private int n;
	
	public Holder(int n) {
		this.n = n;
	}
	
	public void assertSanity() {
		if(n != n) {
			System.out.println("This statement is false");
			throw new AssertionError("This statement is false");
		}
		else {
			System.out.println("Hello Thread World");
		}
	}
	
	
}
