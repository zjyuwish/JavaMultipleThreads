//异常法停止线程
public class MyThreadInterruptForCatch extends Thread{
	public void run() {
		super.run();
		try {
			for(int i = 0; i < 500000; i++) {
				if(this.interrupted()) {
					System.out.println("Already stopped, I'm going to exit");
					throw new InterruptedException();
				}
				System.out.println("i=" + (i +  1));
			}
			System.out.println("I'm under the for loop");
		} catch(InterruptedException e) {
			System.out.println("Enter the catch part");
			e.printStackTrace();
		}
	}
}
