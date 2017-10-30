
public class MyThreadNoShareVariables extends Thread{
	private int count = 5;
	public MyThreadNoShareVariables(String name) {
	    super();
		this.setName(name);
	}
	
	public void run() {
		super.run();
		while(count > 0) {
			count--;
			System.out.println("由 " + this.currentThread().getName() + " 计算, count=" + count);
		}
	}
}
