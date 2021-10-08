package map;

import java.util.HashMap;
import java.util.Iterator;

public class Hash {
	public static void main(String[] args) {
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("a", "hi");
		hashMap.put("b", "hello");
		hashMap.put("c", "world");
		
		System.out.println(hashMap.toString());
		
		System.out.println(hashMap.get("a"));
		
		hashMap.remove("b");
		
		System.out.println(hashMap.toString());
		
		
		// HashMap 각각 접근
		Iterator<String> ite = hashMap.keySet().iterator();
		while(ite.hasNext()) {
			System.out.println(hashMap.get(ite.next()));
		}
		
		
		
		
		
	}

}
