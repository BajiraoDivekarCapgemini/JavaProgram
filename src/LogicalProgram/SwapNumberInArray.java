package LogicalProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapNumberInArray {

	

	public static void main(String[] args) {
//		int arr[]= {1,2,3,4,5,6};
//		int temp1=arr[3];
//		int temp2=arr[4];
//		arr[4]=temp1;
//		arr[3]=temp2;
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+",");
//		}
		
//		int arr[]={1,3,5,7,9,8,10};
		
		int arr[]=new int[] {1,3,5,7,9,8,10};
		
		List<int[]> li=Arrays.asList(arr);
		
		int stratIndex=arr[0];
		int lastIndex=arr[arr.length-1];
		//List li=new ArrayList();
//		for(int i=0;i<arr.length;i++) {
//			li.add(arr[i]);
//			
//		}
		for(int i=stratIndex;i<=lastIndex;i++) {
			if(!li.contains(i)) {
				System.out.print(i+",");
			}
			
		}
		
	
		

	}

}
