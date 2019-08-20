package Test;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int intvar[];
		
		intvar = new int[5];
		
		int[] intvar1 = new int[10];
		
		System.out.println(intvar1.length);
		System.out.println(intvar.length);
		
		int[] array1 = new int[] {1,2,3,4,5,6,7,8};
		
		System.out.println(array1.length);
		
		for(int i=0;i<=array1.length-1;i++) {
			System.out.println("Array values : " + array1[i]); 
		}
		
		
		int[] array2 = new int[] {1,10,3,30,5,6,50,8};
		int temp = 0;
		for(int j=0;j<=array2.length-1;j++) {
			if(temp<array2[j]) {
				temp = array2[j];
				
			}
		}
		
		System.out.println("largest value in array  : " + temp);
		
		int[] array3 = new int[] {1,2,3,4,5,6,7,8,9,10};
		int var = array3.length;
		System.out.println("array Length : " + var);
		for(int z=var;z>0;z--) {
			System.out.println("new array : " + array3[z-1]);
		}*/
		
		int[] dup = new int[] {10,20,30,40,10,1,20,3,4};
		System.out.println("Array length : " + dup.length);
		
		for(int g=0;g<=dup.length-1;g++) {
			for(int f=g+1;f<=dup.length-1;f++) {
				
				if(dup[g]==dup[f]) {
					System.out.println("duplicate value : " + dup[f]);
				
			}
		
			}
		}
		
		
		
			

	}

}
