package threadEx;

import java.lang.annotation.Target;

public class MainClass {
	public static void main(String[] args) {
		ThreadTest test = new ThreadTest();
		
		// Thread(Ÿ��,�̸�)
		Thread thread = new Thread(test,"A");
		
		// thread ����
		thread.start();
		
		
		
		System.out.println(Thread.currentThread().getName());
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println("ħ��");
		}
		
	}

}
