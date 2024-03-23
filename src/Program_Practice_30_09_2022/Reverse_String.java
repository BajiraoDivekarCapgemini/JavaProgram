package Program_Practice_30_09_2022;

public class Reverse_String {
	public static void main(String[] args) {
		
		String str="MADAM";
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Given String is Palindrome: "+rev);
		}
		else {
			System.out.println("Given String is not Palindrome: "+rev);
		}
	
		
		
	}

}
