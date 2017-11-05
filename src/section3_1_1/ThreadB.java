package section3_1_1;

public class ThreadB extends Thread{
	private MyList list;
	public ThreadB(MyList list) {
		super();
		this.list = list;
	}
	public void run() {
		try {
			while (true) {
				if(list.size() != 5) {
					System.out.println("==5, thread b exit");
					throw new InterruptedException();
				}
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
