package DataBaseTest;

public class Test {
	public static void main(String[] args) {
		
		Test01 t01 = new Test01();
		
		t01.Insert();
		
		t01.Delete();
		
		TestDTO dto = t01.Lookup();
		
		try {
			System.out.println(dto.getId());
			System.out.println(dto.getPw());
			System.out.println(dto.getName());
		}catch (Exception e) {
			System.out.println("조회 실패");
		}
		
	}

}
