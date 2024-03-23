package Program_Practice_14_10_2022;

public class Find_Max_Value_In_Array {

	public static void main(String[] args) {
		
		int ar[]= {10,5,40,30,15,34,7,10};
		
		int max=ar[0];
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<max) {
				max=ar[i];
			}
		}
		System.out.println("Maximum value in Array: "+max);

	}

}
