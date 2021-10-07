package launchpay;

public class MainClass {
	public static void main(String[] args) {
		
		Child1 ch1 = new Child1(Pay.RICE,Pay.BULGOGI,Pay.BANANA,Pay.MILK,Pay.ALMOND);
		Child2 ch2 = new Child2(Pay.RICE,Pay.BULGOGI,Pay.BANANA,Pay.MILK,Pay.ALMOND);
		
		System.out.println(ch1.cal());
		System.out.println(ch2.cal());
		
	}

}
