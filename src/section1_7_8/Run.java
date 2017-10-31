package section1_7_8;
//不过还是建议使用抛异常的方法来实现现成的停止，
//因为在catch块中还可以将异常向上抛，使线程停止的事件得以传播
public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		Thread.sleep(2000);
		t.interrupt();
	}
}
