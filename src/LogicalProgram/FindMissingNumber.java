package LogicalProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] nu = { 1, 2, 3, 6 };
		
		List<Integer> li=new ArrayList<>();
		for (int i = 0; i <nu.length; i++) {
		   li.add(nu[i]);
			
		}
		
		
		int first = nu[0];
		int last = nu[nu.length - 1];
		for (int j = first; j <= last; j++) {
			if(!li.contains(j)) {
				System.out.println(j);
			}
			
		}

	}

}
