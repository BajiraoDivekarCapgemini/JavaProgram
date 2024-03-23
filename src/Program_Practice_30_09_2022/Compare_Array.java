package Program_Practice_30_09_2022;

import java.util.Arrays;

public class Compare_Array {
	public static void main(String[] args) {
		
		int [] a= {80,70,30,50,60};
		
		int [] b= {10,60,30,50,60};
		
		int [] c= {10,20,30,50,60};
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		if(a.equals(c)) {
			System.out.println("Both array are equals");
		}
		else {
			System.out.println("Both array are not equals");
		}
	}

}
