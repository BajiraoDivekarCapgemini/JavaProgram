package Program_Practice;

import java.util.Arrays;
import java.util.Collections;

public class SortingelementArray {
	public static void main(String[] args) {

		// Approach 1

		/*
		 * int [] a= {10,20,60,70,5,100};
		 * 
		 * System.out.println("Array Element Before Sorting: "+ Arrays.toString(a));
		 * 
		 * Arrays.parallelSort(a);//Sorting of Element in Aarray
		 * 
		 * System.out.println("Array Element After Sorting: "+ Arrays.toString(a));
		 */
		// Approach 2

		/*int[] a = { 10, 20, 60, 70, 5, 100 };

		System.out.println("Array Element Before Sorting: " + Arrays.toString(a));

		Arrays.sort(a);// Sorting of Element in Aarray

		System.out.println("Array Element After Sorting: " + Arrays.toString(a));
		*/
		
		//Approach 3
		
		Integer a[]= {30,50,20,10,60};
		System.out.println("Array element before sorting: "+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array element After sorting: "+Arrays.toString(a));

	}

}
