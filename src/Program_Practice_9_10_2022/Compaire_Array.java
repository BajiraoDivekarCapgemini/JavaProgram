package Program_Practice_9_10_2022;

import java.util.Arrays;

public class Compaire_Array {
	
	public static void main(String [] args) {
		
		int [] a= {10,20,30,40,50,60};
		
		int [] b= {15,20,70,40,50,80};
		
		int [] c= {10,20,30,40,50,60};
		
	   System.out.println(Arrays.equals(a, c));
	   System.out.println(Arrays.equals(a, b));
	   System.out.println(Arrays.equals(c, a));
	}

}
