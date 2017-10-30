
public class RunMyThreadShareVariables {
	public static void main(String[] args) {
		MyThreadShareVariables mythread = new MyThreadShareVariables();
		Thread a = new Thread(mythread, "A");
		Thread b = new Thread(mythread, "B");
		Thread c = new Thread(mythread, "C");
		a.start();
		b.start();
		c.start();
	}
}
