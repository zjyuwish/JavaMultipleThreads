package section2_2_14;

public class OutClass {
	static class Inner {
		public void method1() {
			synchronized("other lock") {
				for(int i = 1; i <= 10; i++) {
					System.out.println(Thread.currentThread().getName() + " i=" + i);
					try {
						Thread.sleep(100);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		public synchronized void method2() {
			for(int i = 11; i <= 20; i++) {
				System.out.println(Thread.currentThread().getName() + " i=" + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		}
	}
}
