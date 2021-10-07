package toy;

public class Bear implements Move{
	
	public Bear() {
		System.out.println("곰");
		move();
		System.out.println("----------------------");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("움직이기 가능");
	}
	
	

}
