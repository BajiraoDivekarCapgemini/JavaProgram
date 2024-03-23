package Program_Practice_9_10_2022;

public class Palindrome_Number {
	
	
	public static void palindromeNumber(int n) {
		
		int temp=n;
		int rev=0;
		int rem;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println("Given Number is Palindrome :"+rev);
		}
		else {
			System.out.println("Given Number is not Palindrome: "+rev);
		}
		
	}
	
	public static void main(String []agrs) {
		palindromeNumber(12344);
		
		
	}

}
