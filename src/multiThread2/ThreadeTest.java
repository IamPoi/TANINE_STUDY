package multiThread2;

public class ThreadeTest implements Runnable {
	
	int testNum = 0;

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println(Thread.currentThread().getName()+" / "+testNum);
				System.out.println("------------------------------");
				testNum++;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				System.out.println(Thread.currentThread().getName()+" / "+testNum);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

	}

}
