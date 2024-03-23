package LogicalProgram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice1 {

	public static void main(String[] args) {
//		int year=1992;
//
//		if(year%4==0){
//		System.out.println("Given year is leap year");
//		}
//		else{
//		System.out.println("Given year is not leap year");
//		}
		
		String s1="Java";
		String s2=new String("Java");

		String s = "aaaabbbcccccccccccccccccccccddddddddddd";
		char[] ch = s.toCharArray();
		//Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		int[] a = new int[ch.length];
		//int max = a[0];
	//	int ch2='1';
	//	int min=a[0];
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '0';

				}

			}
			a[i]=count;


		}
		int min=a[0];
		char ch2='1';
		for(int j=0;j<ch.length;j++) {
		   char	c=ch[j];
		   if(c!='0' && min>a[j]) {
			   min=a[j];
			   ch2=c;
		   }
		}
		System.out.println(ch2+" = "+min);
		 
//		 int max=0;
//	     for (Map.Entry<Character,Integer> entry : map.entrySet())  {
//	    	char ch1=entry.getKey();
//	    	int zi=entry.getValue();
//	    	if(ch1!='0' && max>zi) {
//	    		max=zi;
//	    		ch2=ch1;
//	    	}
//	    } 



	}

}
