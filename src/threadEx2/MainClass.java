package threadEx2;

public class MainClass {
	public static void main(String[] args) {
		ThreadTest test = new ThreadTest();
		test.setName("B");
		test.start();
		
		System.out.println(Thread.currentThread().getName());
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Ä§Åõ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
