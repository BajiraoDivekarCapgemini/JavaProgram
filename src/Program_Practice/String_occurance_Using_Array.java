package Program_Practice;

public class String_occurance_Using_Array {
	public static void main(String[] args) {
		
		String s="ababac";
		
		char[] s1=s.toCharArray();
		
		for(int i=0;i<=s.length()-1;i++) {
			
			int count=1;
			
			for(int j=i+1;j<=s.length()-1;j++) {
				
				if(s1[i]==s1[j] && s1[j]!=' ') {
					
					count++;
					s1[j]='0';
				}
			}
			if(s1[i]!='0') {
				System.out.println(s1[i]+"   "+count);
			}
		}
		
		
	}

}
