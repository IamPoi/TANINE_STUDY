package Sample;

public class Sample {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = a + b;
		System.out.println("°á°ú c = "+c);
	}
	
	void sumA(int x, int y) {
		int c;
		c = x + y;
		System.out.println("c = "+c);
		return ; 
	}
	
	int sumB(int x, int y) {
		int c;
		c = x + y;
		return c;
	}

}
