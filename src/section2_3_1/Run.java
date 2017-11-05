package section2_3_1;

public class Run {
	public static void main(String[] args) {
		PrintString printStringService = new PrintString();
		//printStringService.printStringMethod();
		new Thread(printStringService).start();
		System.out.println("Stop! stopThread=" + Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}
}
