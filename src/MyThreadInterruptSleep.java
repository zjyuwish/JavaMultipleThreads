//在sleep状态下停止某一线程，会进入catch语句，并清除停止状态值，使之变成false
public class MyThreadInterruptSleep extends Thread{
	public void run() {
		super.run();
		try {
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		}
		catch (InterruptedException e){
			System.out.println("Interrupted when sleep! Enter the catch block!" + this.isInterrupted());
			e.printStackTrace();
		}
	}
}
