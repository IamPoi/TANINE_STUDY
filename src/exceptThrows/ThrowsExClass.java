package exceptThrows;

public class ThrowsExClass {
	public ThrowsExClass() {
		actionC();
	}

	private void actionA() throws Exception {
		System.out.println("actionA");
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(arr[4]);

		System.out.println("actionAA");
	}

	private void actionB() {
		System.out.println("actionB");

		try {
			actionA();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("예외 처리");
		}
		System.out.println("actionBB");
	}

	private void actionC() {
		System.out.println("actionC");
		actionB();
		System.out.println("actionCC");
	}

}