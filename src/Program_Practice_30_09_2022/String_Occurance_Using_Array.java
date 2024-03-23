package Program_Practice_30_09_2022;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class String_Occurance_Using_Array {
	public static void main(String[] args) {
		String s = "selenium java";
		
//		int size=s.length();
//		Set<Character> s1=new LinkedHashSet<Character>();
//		for(int i=0;i<size;i++) {
//		   char	ch=s.charAt(i);
//		   s1.add(ch);
//		   
//		}
		
	   String[]	s1=s.split(" ");
	   int l=s1.length-1;
	   String rev="";
	   for(int i=l;i>=0;i--) {
		   rev=rev+s1[i]+" ";
		   
	   }
	   System.out.println(rev);
	 
		
		
//		System.out.println(s1);
//		char[] s1=s.toCharArray();
//		for(int i=0;i<size;i++) {
//			int count=1;
//			char ch = s.charAt(i);
//			for(int j=i+1;j<size;j++) {
//			 char	ch1=s.charAt(j);
//			 if(ch==ch1) {
//				 s1[j]='1';
//				 count++;
//				
//			 }
//			}
//			if(s1[i]!='1' && s1[i]!=' ') {
//				System.out.println(ch+" = "+count);
//			}
//		}
		
		
		

//		char[] s1 = s.toCharArray();

//		for (int i = 0; i < s.length(); i++) {
//			int count = 1;
//			for (int j = i + 1; j < s.length(); j++) {
//				if (s1[i] == s1[j] ) {
//					count++;
//					s1[j] = '0';
//				}
//			}
//			if (s1[i] != '0') {
//				System.out.println(s1[i] + " =  " + count);
//			}
//		}
	}
}
