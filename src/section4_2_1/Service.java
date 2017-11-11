package section4_2_1;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	public void read() {
		try {
			try {
				lock.readLock().lock();
				System.out.println("Get lock " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
				Thread.sleep(10000);
			} finally {
				lock.readLock().unlock();
			} 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
