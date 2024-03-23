package Program_Practice;

public class Reverse_String {
	public static void main(String[] args) {
		
		String org="SHRAVANI";
		String rev="";
		for(int i=org.length()-1;i>=0;i--) {
			
			rev=rev+org.charAt(i);
		}
		if(rev.equals(org)) {
			System.out.println("Given String is palindrome");
		}
		else {
			System.out.println("Given String is not palindrome");
		}
		
	}

}
