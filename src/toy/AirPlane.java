package toy;

public class AirPlane implements Light,Missile{
	
	public AirPlane() {
		System.out.println("�����");
		missile();
		light();
		System.out.println("----------------------");
	}

	@Override
	public void missile() {
		// TODO Auto-generated method stub
		System.out.println("�̻��� ����");
	}

	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.println("����Ʈ����");
	}
	
	

}
