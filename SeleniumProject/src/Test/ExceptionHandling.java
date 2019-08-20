package Test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test();
	}
	
	public static void test() {
		
		int a = 10;
		int b = 20;
		try {
			int[] s = new int[1];
			s[0] = 10;
			for(int j=0;j<=s.length;j++) {
				System.out.println("Array value : " + s[j]);
			}
//			System.out.println("The value : " + z);
		}
		catch(Exception e) {
			System.out.println("exception occured");
		}
		finally{
			int z = a+b;
			System.out.println("The value : " + z);
		}
		
}
	
}


//throw
//ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException, SecurityException
