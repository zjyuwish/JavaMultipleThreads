package section3_1_1;

public class ThreadA extends Thread {
	private MyList list;
	public ThreadA(MyList list) {
		super();
		this.list = list;
	}
	public void run() {
		try {
			for(int i = 0; i < 10; i++) {
				list.add();
				System.out.println("Add " + (i + 1) + "elements");
				Thread.sleep(1000);
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
