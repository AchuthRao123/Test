package Polymorphism;

public class overloading {
	
	public void add(int a,int b) {
		
		
		int c = a+ b;
		System.out.println("sum of a,b : "+c);
	}
	
	public void add(int a,int b,int d) {
		
		
		int c = a+ b + d;
		System.out.println("sum of a,b,d : "+c);
	}
	
	public void add(String a,String b) {
		
		
		String c = a+ b;
		System.out.println("a,b : "+c);
	}

}
