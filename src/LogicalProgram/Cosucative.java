package LogicalProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cosucative {

	public static void main(String[] args) {

		int [] ar= {1234,1356,2142,2312,3214,1289,1426};
		for(int i=0;i<ar.length;i++) {
			int temp=0;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]<ar[i]) {
					 temp = ar[i];
		               ar[i] = ar[j];
		               ar[j] = temp;
				}
				
			}
			System.out.println(ar[i]+" ");
	
			
		}
		
	}
	
	public static boolean getMaxCon(String str, String str1,char a) {
		try {
			char[] ar = str.toCharArray();
			int count=0;
			for(int i=0;i<ar.length-1;i++) {
				if(ar[i]==ar[i+1]) {
					count++;
				}
			}
			
			char[] ar1 = str1.toCharArray();
			int count1=0;
			for(int i=0;i<ar.length-1;i++) {
				if(ar1[i]==ar1[i+1]) {
					count1++;
				}
			}
			
			int maxcount=0;
			
			if(count1>count) {
				maxcount=count1;
				System.out.println(str1+"="+maxcount);
				return true;
				
			}
			if(count1<count){
				maxcount=count;
				System.out.println(str+" = "+maxcount);
				return true;
			}else {
				return false;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	public static void removeDuplocateFromArr(int[] a) {
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		System.out.println(set);		
		
	}
	
	public static void sort(int[] a) {
		int [] ar= {1234,1356,2142,2312,3214,1289,1426};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					a[j]=a[i];
				}
				
			}
			
		}
		
	}
	
	
	

}
