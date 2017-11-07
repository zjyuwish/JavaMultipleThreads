package section3_1_11_5;

public class P {
	private MyStack myStack;
	public P(MyStack myStack) {
		super();
		this.myStack = myStack;
	}
	public void pushService() {
		myStack.push();
	}
}
