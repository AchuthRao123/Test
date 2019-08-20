package Test;

public class stringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String M = "";
		String MM = "";
		String a = "test string";
		String cc = "Test string";
		
		String c = "NEW";
		
		System.out.println("value of a : " + a);
		
		//Replace
		String b = a.replace(" ","");
		
		System.out.println("Replace Method : "+b);
		
		//Concat
		String d = a.concat(b).concat(c);
		
		System.out.println("concat : "+d);
		
		
		//Split,Reverse string
		String[] e = a.split(" ");
		
		int z = e.length;
		
		System.out.println("Split array size : "+z);
		
			
		for(int i=0;i<=z-1;i++) {
			
			System.out.println("Split values : "+e[i]);
		
		}
		
		for(int j=z-1;j>=0;j--) {
			System.out.println("Reverse single string : " + e[j] );
		}
		
		for(int j=z-1;j>=0;j--) {
			
			M=M+" "+e[j];
			
		}
		
		System.out.println("Reverse single string : " + M );
		
		
		//chatAt,Reverse characters
		
		char v = a.charAt(0);
		
		System.out.println("char at : " + v);
		
		int gg = a.length();
		
		System.out.println("length of string : "+ gg);
		
		for(int y=gg-1;y>=0;y--) {
			
			MM = MM+a.charAt(y);
			
		}
		
		System.out.println("Reverse characters : "+MM);
		
		boolean DD = a.contains("Z");
		
		System.out.println("string contains Z : "+DD);
		
		boolean DV = a.contains("test");
		
		System.out.println("string contains test : "+DV);
		
		boolean XX = a.equals(cc);
		
		boolean cx = a.equalsIgnoreCase(cc);
		
		System.out.println("Equals without ignore case: "+XX);
		
		System.out.println("Equals ignore case : "+cx);
		
		
		String t = "Hi how r u";
		
		t.concat("I am Good");
		String g = t.concat("I am good");
		System.out.println(""+g);
		
		StringBuffer tt =new StringBuffer(t);  
		tt.append("java"); 
		System.out.println(""+tt);
	      
	    StringBuilder builder=new StringBuilder("hello");  
        builder.append("java");  
        System.out.println(builder);
		
	

	}
	


}
