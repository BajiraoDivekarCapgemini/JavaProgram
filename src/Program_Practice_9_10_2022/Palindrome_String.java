package Program_Practice_9_10_2022;

public class Palindrome_String {
	
	
	public static void palindromeString(String s) {
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		if(rev.equals(s)) {
			System.out.println("Given String is palindrome: "+rev);
		}
		else {
			System.out.println("Given String is not palindrome: "+rev);
		}
		
	}
	
	public static void main(String [] agrs) {
		palindromeString("SCHOOL");
		
		
	}

}
