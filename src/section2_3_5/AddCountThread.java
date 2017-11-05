package section2_3_5;
import java.util.concurrent.atomic.*;

//使用原子类
public class AddCountThread extends Thread {
	private AtomicInteger count = new AtomicInteger(0);
	public void run() {
		for(int i = 0; i < 10000; i++) {
			System.out.println(count.incrementAndGet());
		}
	}
}
