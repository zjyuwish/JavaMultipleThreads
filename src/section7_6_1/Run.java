package section7_6_1;

public class Run {
	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("My Thread Group");
		MyThread[] myThread = new MyThread[10];
		for(int i = 0; i < myThread.length; i++) {
			myThread[i] = new MyThread(group, "Thread " + (i + 1), "1");
			myThread[i].start();
		}
		MyThread newT = new MyThread(group, "Error Thread", "a");
		newT.start();
	}
}
