package Test;

import com.sun.jna.StringArray;

public class Demo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoke test method
		test_Split();
		
		//invoke concatenation method
		//test_Con();
			
	}
	
	public static String test_Split() {

		String newvar = "";
		String var = "test again Guide Wire";
		
		System.out.println("Legth of string : " + var.length());
		
		String[] var1 = var.split(" ");
		
		for(int i=0;i<=var1.length-1;i++) {
			System.out.println("split data : " + var1[i]);
		}
		
		
		for(int j = 0;j<=var1.length-1;j++) {
			
			newvar += var1[j]+" ";
			
			newvar = newvar+var1[j];
			
			//System.out.println("split data : " + var1[j]);
			
		}
		
		System.out.println("Concat string : " + newvar);
		

	
		
		
		return null;
		
	}
	
	public static String test_Con() {
		
		String var = "test again Guide Wire";
		String newstr = "||TEST AGAIN";
		
		System.out.println("Length of string : " + var.length());
		
		String var2 = var.replace(" ", "");
		
		String var3 = var.concat(newstr);
		
		System.out.println("concatinated string : "+var2);
		
		System.out.println("concatinated string : "+var3);
		
		
		return null;
		
	}


}
