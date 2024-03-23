package Program_Practice;

public class Reverse_Number {
	public static void main(String[] args) {
		
		/*int num=4567;
		int rev=0;
		while(num>0) {
			
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		*/
		
		//Check Number is palindrome or not
		
		int num=121;
		int temp=num;
		int rev=0;
		while(num>0) {
			
			rev=rev*10+num%10;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("Given Number is Palindrome");
		}
		else {
			System.out.println("Given Number is not Palindrome");
		}
	}

}
