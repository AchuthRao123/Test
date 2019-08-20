package DataTypes;

import java.util.HashMap;

public class hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		hm.put("ID", 10);
		hm.put("SL Number", 12);
		
		System.out.println("value : "+ hm.get("ID"));
		System.out.println("value : "+ hm.get("SL Number"));

	}

}
