package section3_1_11_5;
import java.util.*;
public class MyStack {
	private List list = new ArrayList();
	synchronized public void push() {
		try {
			while(list.size() == 1) {
				System.out.println("push:" + Thread.currentThread().getName() + "is waiting");
				this.wait();
			}
			System.out.println("push:" + Thread.currentThread().getName() + "is released");
			list.add("anyString=" + Math.random());
			this.notifyAll();
			System.out.println("push=" + list.size());
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	synchronized public String pop() {
		String returnValue = "";
		try {
			while(list.size() == 0) {
				System.out.println("pop:" + Thread.currentThread().getName() + "is waiting");
				this.wait();
			}
			System.out.println("pop:" + Thread.currentThread().getName() + "is released");
			
			returnValue = "" + list.get(0);
			list.remove(0);
			this.notifyAll();
			System.out.println("pop=" + list.size());
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		return returnValue;
	}
}
