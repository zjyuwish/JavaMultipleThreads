
public class RunMyThreadNoShareVariables {
	public static void main(String[] args) {
		MyThreadNoShareVariables a = new MyThreadNoShareVariables("A");
		MyThreadNoShareVariables b = new MyThreadNoShareVariables("B");
		MyThreadNoShareVariables c = new MyThreadNoShareVariables("C");
		a.start();
		b.start();
		c.start();
	}
}
