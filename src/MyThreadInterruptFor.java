//并没有真正得停止线程
public class MyThreadInterruptFor extends Thread{
	public void run() {
		super.run();
		for(int i = 0; i < 500000; i++) {
			if (this.interrupted()) {
				System.out.println("Already stopped! I'm going to exit");
				break;
			}
			System.out.println("i=" + (i + 1));
		}
		System.out.println("I'm outputted, thread is not stopped");
	}
}
