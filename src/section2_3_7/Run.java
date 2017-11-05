package section2_3_7;
//synchronized不仅可以解决一个线程看到的对象处于不一致的状态，还可以保证进入同步方法或者同步代码块的每个线程，都看到由同一个锁保护之前所有的修改状态
public class Run {
	public static void main(String[] args) {
		try {
			Service service = new Service();
			ThreadA a = new ThreadA(service);
			a.start();
			Thread.sleep(1000);
			ThreadB b = new ThreadB(service);
			b.start();
			System.out.println("Already sent stop sign");
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}
