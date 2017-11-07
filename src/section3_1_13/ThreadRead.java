package section3_1_13;
import java.io.PipedReader;

public class ThreadRead extends Thread{
	private ReadData read;
	private PipedReader input;
	
	public ThreadRead(ReadData read, PipedReader input) {
		super();
		this.read = read;
		this.input = input;
	}
	
	public void run() {
		read.readMethod(input);
	}
}
