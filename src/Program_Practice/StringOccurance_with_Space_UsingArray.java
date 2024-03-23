package Program_Practice;

public class StringOccurance_with_Space_UsingArray {
	public static void main(String[] args) {
		
		String s="i am not going anywhere";
		
		char[] s1=s.toCharArray();//Converts this string to a new character array.

		for(int i=0;i<s.length();i++) {
			
			int count=1;
			
			for(int j=i+1;j<s.length()-1;j++) {
				
				if(s1[i]==s1[j] && s1[j]!=' ') {
					count++;
					s1[j]='0';
				}
			}
			if(s1[i]!='0' && s1[i]!=' ') {
				System.out.println(s1[i]+" = "+count);
			}
		}

		
	}

}
