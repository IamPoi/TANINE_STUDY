package Sample;

public class Sample3 {

	public static void main(String[] args) {
		HelloCount h1 = new HelloCount();
		HelloCount h2 = new HelloCount();
		
		h1.sayHello();
		h1.sayHello();
		h2.sayHello();
		h2.sayHello();
		h2.sayHello();

	}

	public class HelloCount{
		private static int sCount = 0;
		private int nCount = 0;

		public void sayHello() {
			sCount += 1;
			nCount += 1;

			System.out.println("sCount : " + sCount);
			System.out.println("nCount : " + nCount);
		}
	}

}
