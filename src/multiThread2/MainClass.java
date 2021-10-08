package multiThread2;

public class MainClass {
	public static void main(String[] args) {
		
		ThreadeTest test1 = new ThreadeTest();
		ThreadeTest test2 = new ThreadeTest();
		
		Thread thread1= new Thread(test1, "A");
		Thread thread2= new Thread(test2, "B");
		
		thread1.start();
		thread2.start();
		
		System.out.println(Thread.currentThread().getName());
	}

}
