package exceptEx;

public class MainClass {
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		
		System.out.println("i * j = "+(i*j));
		try {
			System.out.println("i / j = "+(i/j));
		}catch (Exception e) {
			System.out.println("i / j = "+i+" / "+j+" ??");
		}
		System.out.println("i + j = "+(i+j));
		System.out.println("i - j = "+(i-j));
		
	}

}
