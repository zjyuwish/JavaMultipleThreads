package section3_3_2_1;

import java.util.Date;

public class ThreadB extends Thread {
	public void run() {
		try {
			for(int i = 0; i < 20; i++) {
				if(Tools.t1.get() == null) {
					Tools.t1.set(new Date());
				}
				System.out.println("B " + Tools.t1.get().getTime());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
