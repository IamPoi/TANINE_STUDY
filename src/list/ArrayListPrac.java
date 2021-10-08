package list;

import java.util.ArrayList;

public class ArrayListPrac {
	public static void main(String[] args) {
		
	
	
	ArrayList<String> al = new ArrayList<String>();
	
	al.add("Hello");
	al.add("World");
	al.add("Hi");
	
	System.out.println(al);
	
	for(int i = 0; i < al.size(); i++) {
		System.out.println(al.get(i));
	}
	
	}
	

}
