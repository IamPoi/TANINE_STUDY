package vote2;

public class MainClass {
	public static void main(String[] args) {
		VoteThread vote1 = new VoteThread();
		VoteThread vote2 = new VoteThread();
		VoteThread vote3 = new VoteThread();

		Thread location1 = new Thread(vote1, "1�� ����");
		Thread location2 = new Thread(vote1, "2�� ����");
		Thread location3 = new Thread(vote1, "3�� ����");

		location1.start();
		location2.start();
		location3.start();

	}

}
