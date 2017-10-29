
public class HolderMain {
	public Holder holder;
	
	public void threadTest() {
		for(int i = 0; i < 1000; i++) {

			new Thread(new Runnable() {
				public void run() {
					if(holder != null) {
						holder.assertSanity();
					}
				}
			}).start();
			
			new Thread(new Runnable() {
				public void run() {
					holder = new Holder(42);
				}
			}).start();
			
		}
	}
	public static void main(String args[]) {
		HolderMain h = new HolderMain();
		h.threadTest();
		
	}
}
