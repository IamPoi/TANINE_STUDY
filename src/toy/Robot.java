package toy;

public class Robot implements Move,Missile,Light{
	
	public Robot() {
		System.out.println("�κ�");
		light();
		missile();
		move();
		System.out.println("----------------------");
	}

	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.println("�Һ� ����");
	}

	@Override
	public void missile() {
		// TODO Auto-generated method stub
		System.out.println("�̻��� ����");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("�����̱� ����");
	}

}
