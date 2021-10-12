package SerializationEx;

public class Employee {
	private String name;
	private String dept;
	private String title;
	
	
	public Employee(String name, String dept, String title) {
		super();
		this.name = name;
		this.dept = dept;
		this.title = title;
	}
	
	public String toString() {
		return name+":"+dept+":"+title;
	}
	
	public String getSerialData() {
		
		String data = "name = "+name+ "\r\n";
		data += "dept = "+dept+"\r\n";
		data += "title = "+title;
		return data;
	}
	

}
