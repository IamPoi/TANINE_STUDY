package vote2;

public class MainClass {
	public static void main(String[] args) {
		VoteThread vote1 = new VoteThread();
		VoteThread vote2 = new VoteThread();
		VoteThread vote3 = new VoteThread();

		Thread location1 = new Thread(vote1, "1번 지역");
		Thread location2 = new Thread(vote1, "2번 지역");
		Thread location3 = new Thread(vote1, "3번 지역");

		location1.start();
		location2.start();
		location3.start();

	}

}
