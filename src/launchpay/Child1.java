package launchpay;

public class Child1 extends LunchMenu{

	public Child1(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int cal() {
		// TODO Auto-generated method stub
		return rice+bulgogi+banana;
	}
	

}
