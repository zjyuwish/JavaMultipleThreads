
public class ThreadInterruptRun {
	public static void main(String[] args) {
		try {
			MyThreadShareVariables thread = new MyThreadShareVariables();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			
			// interrupted都是判断当前线程是否中断，当前线程是main,执行后将状态标志值清楚为false的功能
			//isInterrupted 是作用于调用该方法的线程对象所对应的线程, 但是以当一个线程处于中断状态时，如果再由wait、sleep以及jion三个方法引起的阻塞，那么JVM会将线程的中断标志重新设置为false，并抛出一个InterruptedException异常，然后开发人员可以中断状态位“的本质作用-----就是程序员根据try-catch功能块捕捉jvm抛出的InterruptedException异常来做各种处理，比如如何退出线程。总之interrupt的作用就是需要用户自己去监视线程的状态位并做处理。
			//isInterrupted不清除状态
			System.out.println("IS stopped 2? =" + thread.isInterrupted());
//			System.out.println("Is stopped 1? =" + thread.interrupted());
//			System.out.println("Is stopped 2? =" + thread.interrupted());
//			System.out.println("Current Thread Name is " + Thread.currentThread().getName());
			Thread.currentThread().interrupt();
			System.out.println("IS stopped 1? =" + 	Thread.currentThread().isInterrupted());
			System.out.println("IS stopped 2? =" + Thread.currentThread().isInterrupted());
//			System.out.println("Thread Is stopped 1? =" + thread.interrupted());
//			System.out.println("Thread Is stopped 1? =" + thread.interrupted());
//			System.out.println("Thread Is stopped 2? =" + Thread.interrupted());
		}
		catch(InterruptedException e) {
			//System.out.println("IS stopped 3? =" + Thread.isInterrupted());
			System.out.println("main catch");
//			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
