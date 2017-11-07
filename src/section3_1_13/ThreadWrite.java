package section3_1_13;
import java.io.PipedWriter;

public class ThreadWrite extends Thread{
	private WriteData write;
	private PipedWriter out;
	
	public ThreadWrite(WriteData write, PipedWriter out) {
		super();
		this.write = write;
		this.out = out;
	}
	
	public void run() {
		write.writeData(out);
	}
}
