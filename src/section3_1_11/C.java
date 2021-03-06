package section3_1_11;

public class C {
	private String lock;
	public C(String lock) {
		super();
		this.lock = lock;
	}
	public void getValue() {
		try {
			synchronized(lock) {
				if(ValueObject.value.equals("")) {
					lock.wait();
				}
				System.out.println("Get value is " + ValueObject.value);
				ValueObject.value = "";
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
