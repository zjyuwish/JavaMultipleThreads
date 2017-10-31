package section1_8_2;
//pend造成公共的同步对象的独占
public class Run {
	public static void main(String[] args) {
		try {
			final SynchronizedObject object = new SynchronizedObject();
			Thread thread1 = new Thread() {
				public void run() {
					object.printString();
				}
			};
			thread1.setName("a");
			thread1.start();
			Thread.sleep(1000);
			Thread thread2 = new Thread() {
				public void run() {
					System.out.println("thread2 started, but can not enter printString(), only print 1 begin");
					System.out.println("Because printString() was locked by thread a and suspend forever");
					object.printString();
				
				}
			};
			thread2.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
