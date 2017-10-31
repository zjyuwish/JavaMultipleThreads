package section1_8_2;

public class SynchronizedObject {
	synchronized public void printString() {
		System.out.println("begin");
		if(Thread.currentThread().getName().equals("a")) {
			System.out.println("a is forever suspended!");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}
}
