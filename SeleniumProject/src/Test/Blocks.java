package Test;

public class Blocks {
	
	static int a = 10;
	static int b;
	
	//Static block executes before even the main class.
	static {
		System.out.println("static block begins");
		
		b = a+10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main method begins");
		System.out.println("value of a : "+a);
		System.out.println("value of b : "+b);
		
		int[] z = add(a,b);
		
		System.out.println("New value oa a : " + z[0]);
		System.out.println("New value oa a : " + z[1]);

	}
	
	public static int[] add(int a,int b) {
		
		int[] array = new int[2];
		
		array[0] = a*b;
		
		array[1] = a+10;
		
//		a = a*b;
//
//		b = a+10;
		
		return array;
		
	}

}
