package section2_3_6;
import java.util.concurrent.atomic.*;
//输出结果也具有随机性 addAndGet()方法是原子的 但方法和方法之间的调用却不是原子的
public class MyService {
	public static AtomicLong aiRef = new AtomicLong();
	public void addNum() {
		System.out.println(Thread.currentThread().getName() + "加了100之后的值是: " + aiRef.addAndGet(100));
		aiRef.addAndGet(1);
	}
}
