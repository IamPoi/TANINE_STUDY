package Sample;

public class Sample2 {

	public class MotorCycle {
		private int id;
		private int speed;

		public void setData(int i, int s) {
			id = i;
			speed = s;
		}

		public void drive() {
			System.out.println("�� ��������� ��ȣ���� " + id + "�Դϴ�.");
			System.out.println("������̴� ���� " + speed + "Km �ӵ��� �޸��ϴ�.");
		}
	}

	public static void main(String[] args) {

		MotorCycle c = null;
		c = new MotorCycle();

		c.setData(1234, 100);

		c.drive();
	}

}
