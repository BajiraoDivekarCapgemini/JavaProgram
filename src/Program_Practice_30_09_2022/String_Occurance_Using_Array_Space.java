package Program_Practice_30_09_2022;

public class String_Occurance_Using_Array_Space {

	public static void main(String[] args) {
		
		// find the occurance of cHAR 'a'
		String s = "Love You Shravani";
		int count=0;
		for(int i=0;i<s.length();i++) {
		  char	ch=s.charAt(i);
		  if(ch=='a') {
			  count++;
		  }
		
		}
		System.out.println(count);
		
		
		

//		char[] s1 = s.toCharArray();
		
//		for(int i=0;i<s.length();i++) {
//			int count=1;
//			for(int j=i+1;j<s.length();j++) {
//				if(s1[i]==s1[j]) {
//					count++;
//					s1[j]='0';
//				}
//				
//			}
//			if(s1[i]!='0'&& s1[i]!=' ') {
//				System.out.println(s1[i]+ " ="+count);
//			}
//		}

	}

}
