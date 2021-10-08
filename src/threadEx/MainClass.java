package threadEx;

import java.lang.annotation.Target;

public class MainClass {
	public static void main(String[] args) {
		ThreadTest test = new ThreadTest();
		
		// Thread(타겟,이름)
		Thread thread = new Thread(test,"A");
		
		// thread 시작
		thread.start();
		
		
		
		System.out.println(Thread.currentThread().getName());
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println("침투");
		}
		
	}

}
