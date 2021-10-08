package set;

import java.util.HashSet;

public class set {
	public static void main(String[] args) {
		
	HashSet<String> hashSet = new HashSet<String>();
	
	hashSet.add("str3");
	hashSet.add("str0");
	hashSet.add("str2");
	hashSet.add("str1");
	hashSet.add("str1");

	System.out.println(hashSet.toString());
	
	System.out.println(hashSet.size());
	
	hashSet.remove("str0");

	System.out.println(hashSet.toString());
	}
}
