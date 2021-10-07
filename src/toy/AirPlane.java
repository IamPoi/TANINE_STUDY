package toy;

public class AirPlane implements Light,Missile{
	
	public AirPlane() {
		System.out.println("비행기");
		missile();
		light();
		System.out.println("----------------------");
	}

	@Override
	public void missile() {
		// TODO Auto-generated method stub
		System.out.println("미사일 가능");
	}

	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.println("라이트가능");
	}
	
	

}
