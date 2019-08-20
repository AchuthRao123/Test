package Test;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub		
				
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		
//		System.out.println("Size of array list : " + al.size());
//		
//		al.add(678);
//		
//		al.add(1);
//		
//		al.add(2);
//		
//		al.add(3);
//		
//		al.add(5);
//		
//		System.out.println("Size of array list : " + al.size());
//		
//		for(int i=0;i<al.size();i++) {
//			System.out.println("Array List Values : " + al.get(i));
//		}
//		
//		al.set(0, 20);
//		
//		System.out.println("Array List 0 Values : " + al.get(0));
//		
//		al.remove(3);
//		
//		System.out.println("Size of array list : " + al.size());
//		
//		
//		//Call String array method
//		string_arraylist();
//		
		//call array duplicate
		eliminate_dup();
		
		
	}
	
	public static void string_arraylist() {
		
		ArrayList<String> st = new ArrayList<String>();
		
		st.add("test");
		
		st.add("Guide");
		
		st.add("Wire");
		
		System.out.println("String Array list size : " + st.size());
		
		System.out.println(st);
		
		for(int j = 0;j<st.size();j++) {
			System.out.println("String Array List values : "+ st.get(j));
		}
		
	}
	
	public static void eliminate_dup() {
		
		ArrayList all = new ArrayList();
		
		all.add(1);
		
		all.add(2);
		
		all.add(3);
		
		all.add(4);
		
		all.add(1);
		
		all.add(20);
		
		all.add(10);
		
		all.add(22);
		
		
		int z = all.size();
		
		for(int h=0;h<all.size();h++) {
			System.out.println("Arraylist data : "+all.get(h));
		}
		
		for(int a=0;a<z-1;a++) {
			for(int b=a+1;b<z-1;b++) {
				
				if(all.get(a)==all.get(b)) {
					System.out.println("duplicate : "+ all.get(b));
					all.remove(b);
				}
				
			}
			
		}
		
		for(int h=0;h<all.size();h++) {
			System.out.println("New Arraylist data : "+all.get(h));
		}
		
		
	}
	


}
