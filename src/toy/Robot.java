package toy;

public class Robot implements Move,Missile,Light{
	
	public Robot() {
		System.out.println("로봇");
		light();
		missile();
		move();
		System.out.println("----------------------");
	}

	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.println("불빛 가능");
	}

	@Override
	public void missile() {
		// TODO Auto-generated method stub
		System.out.println("미사일 가능");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("움직이기 가능");
	}

}
