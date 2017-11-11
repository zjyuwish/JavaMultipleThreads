package section4_1_3;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//使用await使当前线程进入waiting状态
public class MyService {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	public void await() {
		try {
			lock.lock();
			System.out.println("A");
			condition.await();
			System.out.println("B");
		} catch (InterruptedException e) {
			lock.unlock();
			e.printStackTrace();
		}
	}
}
