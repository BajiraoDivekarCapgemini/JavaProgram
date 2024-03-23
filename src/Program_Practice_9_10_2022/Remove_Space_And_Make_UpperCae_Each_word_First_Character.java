package Program_Practice_9_10_2022;

public class Remove_Space_And_Make_UpperCae_Each_word_First_Character {
	
	public static void main(String[] args) {
		
		
		String str="love you india";
		
		/*String[] words=str.split(" ");
		
		for(String w:words) {
			
			char ch = w.charAt(0);
			
			String s=String.valueOf(ch);
			
			s.toUpperCase();
			}
		*/
		
		
		String str1="";
		for(int i=0;i<=str.length()-1;i++) {
			
			if(str.charAt(i)==' ') {
				
				char ch = str.charAt(i+1);
				
				String s=String.valueOf(ch).toUpperCase();
				
				
				System.out.println(s);
				
				//str1=str.replaceAll("\\s", "");
				//str.re
				//str.charAt(i+1)
			}
			
		}
		//System.out.println(str1);
		
	}

}
