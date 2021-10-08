package multiThread;

public class MainClass {
	public static void main(String[] args) {
		
		ThreadeTest test = new ThreadeTest();
		
		Thread thread1= new Thread(test, "A");
		Thread thread2= new Thread(test, "B");
		
		thread1.start();
		thread2.start();
	}

}
