package vote2;

import java.util.Random;

public class VoteThread implements Runnable{
	
	int targetNum = 100;
	int sum = 0;
	Random random = new Random();
	
	
	@Override
	public void run() {

		
		while(true) {

			String sb = "";
			sum = sum + random.nextInt(10);
			
			
			if (sum >= targetNum) {
				sum = 100;
				for(int i =0;i < sum; i++) {
					sb = sb + "*";
				}
				System.out.println(Thread.currentThread().getName() + " 개표율 : "+ sum + "  \t" +sb );
				break;
			}else {
				for(int i =0;i < sum; i++) {
					sb = sb + "*";
				}
				System.out.println(Thread.currentThread().getName() + " 개표율 : "+ sum + "  \t" +sb );	
			}
			try {
				Thread.sleep(100);
			}catch (Exception e) {
			}
		}
				
	}
	
	

}
