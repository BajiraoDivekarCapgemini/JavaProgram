package LogicalProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Find_Max_Number {

	public static void main(String[] args) {
		int [] arr= {10,20,30,40,12,34,56,54,32,20,2,2,3,1,1,1,3,3};
		
		List<Integer> li=new ArrayList<Integer>();
		for(Integer a:arr) {
			li.add(a);
		}
		
		//Arrays.sort(arr);
		//System.out.println(arr[arr.length-5]);
		Collections.sort(li);
		
		System.out.println(li);
		
		

	}

}
