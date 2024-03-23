package Program_Practice_30_09_2022;

public class Palindrome_Number {
	public static void main(String [] args) {
		
		int num=123;
		int temp=num;
		int rem;
		int rev=0;
		while(num>0) {
			
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("Given Number is Palindrome: "+rev);
		}
		else {
			System.out.println("Given Number is not Palindrome: "+rev);
		}
		
		
		
	}

}
