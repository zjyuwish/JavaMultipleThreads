package section3_1_4;
//wait被执行后 锁自动释放 notify必须执行notify方法所在的同步synchronized代码块才释放锁
public class Service {
	public void testMethod(Object lock) {
		try {
			synchronized(lock) {
				System.out.println("begin wait()");
				lock.wait();
				//Thread.sleep(3000);
				System.out.println("end wait()");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
