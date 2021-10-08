package threadEx2;

public class ThreadTest extends Thread{
	
	@Override
	public void run() {
		System.out.println("--------------------------------");
		System.out.println(Thread.currentThread().getName());
		System.out.println("--------------------------------");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
