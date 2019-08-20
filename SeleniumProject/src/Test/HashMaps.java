package Test;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//Call hashmap
		hashmaps();
	}
	
	public static void hashmaps() {
		

		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		hm.put("A", 20);
		hm.put("B", 40);
		hm.put("C", 60);
		
		int d = hm.size();
		
		int e = hm.get("A");
		
		boolean f = hm.containsKey("A");
		
		boolean g = hm.containsKey("Z");
					
		System.out.println("Hash map size : " + d);
		System.out.println("Value of A : "+ e);
		System.out.println(("Key A is available : " + f));
		System.out.println(("Key Z is available : " + g));

	}

}
