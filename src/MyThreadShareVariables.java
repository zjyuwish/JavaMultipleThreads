//使用同步和不使用对比
public class MyThreadShareVariables extends Thread {
	private int count = 5;
//	synchronized public void run() {
//		super.run();
//		while(count > 0) {
//			count--;
//			System.out.println("由 " + this.currentThread().getName() + " 计算, count=" + count);
//		}
//	}
	public void run() {
		super.run();
		while(count > 0) {
			count--;
			System.out.println("由 " + this.currentThread().getName() + " 计算, count=" + count);
		}
	}
	
}
