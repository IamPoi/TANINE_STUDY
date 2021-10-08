package set;

import java.util.HashSet;

public class MainClass {
	
	public static void main(String[] args) {
		
		HashSet<Student> hash = new HashSet<Student>();
		
		hash.add(new Student("ȫ�浿", 3));
		hash.add(new Student("ȫ�浿", 3));
		hash.add(new Student("ȫ�浿", 3));
		
		System.out.println(hash.toString());
		System.out.println(hash);
		
//		System.out.println(hash.);
		
	}

}
