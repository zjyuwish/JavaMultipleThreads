package section3_1_11_5;

public class C {
	private MyStack myStack;
	public C(MyStack myStack) {
		this.myStack = myStack;
	}
	public void popService() {
		System.out.println("pop=" + myStack.pop());
	}
}
