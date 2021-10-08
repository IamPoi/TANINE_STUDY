package set;

public class Student {
	
	private String name;
	private int grade;
	
	public Student(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name +" / " + grade;
	}

}
