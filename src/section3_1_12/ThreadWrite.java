package section3_1_12;
import java.io.PipedOutputStream;

public class ThreadWrite extends Thread {
	private WriteData write;
	private PipedOutputStream out;
	
	public ThreadWrite(WriteData write, PipedOutputStream out) {
		super();
		this.write = write;
		this.out = out;
	}
	
	public void run() {
		write.writeMethod(out);
	}
}
