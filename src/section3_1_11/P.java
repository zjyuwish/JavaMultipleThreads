package section3_1_11;

public class P {
	private String lock;
	public P(String lock) {
		super();
		this.lock = lock;
	}
	public void setValue() {
		try {
			synchronized (lock) {
				if(!ValueObject.value.equals("")) {
					lock.wait();
				}
				String value = System.currentTimeMillis() + "_" + System.nanoTime();
				System.out.println("Set value is " + value);
				ValueObject.value = value;
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
