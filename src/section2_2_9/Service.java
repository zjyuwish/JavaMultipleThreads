package section2_2_9;
//class类锁和方法锁
public class Service {
	synchronized public static void printA() {
		try {
			System.out.println("Thread name: " + Thread.currentThread().getName() + "when " + System.currentTimeMillis() + "enter printA");
			Thread.sleep(3000);
			System.out.println("Thread name: " + Thread.currentThread().getName() + "when " + System.currentTimeMillis() + "leave printA");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	synchronized public static void printB() {
		System.out.println("Thread name: " + Thread.currentThread().getName() + "when " + System.currentTimeMillis() + "enter printB");
		System.out.println("Thread name: " + Thread.currentThread().getName() + "when " + System.currentTimeMillis() + "leave printB");
	}
	synchronized public void printC() {
		System.out.println("Thread name: " + Thread.currentThread().getName() + "when " + System.currentTimeMillis() + "enter printC");
		System.out.println("Thread name: " + Thread.currentThread().getName() + "when " + System.currentTimeMillis() + "leave printC");
	}
}
