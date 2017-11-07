package section3_1_10;

public class Subtract {
	private String lock;
	public Subtract(String lock) {
		super();
		this.lock = lock;
	}
	public void subtract() {
		try {
			synchronized(lock) {
				if(ValueObject.list.size() == 0) {
					System.out.println("wait begin ThreadName=" + Thread.currentThread().getName());
					lock.wait();
					System.out.println("wait end ThreadName=" + Thread.currentThread().getName());
				} 
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
