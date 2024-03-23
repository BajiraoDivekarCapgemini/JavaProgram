package Program_Practice_30_09_2022;

public class Reverse_Number {
	public static void main(String [] args) {
		
		int num=456;
		int rev=0;
		int rem;
		
		while(num>0) {
			
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
	System.out.println(rev);
	}

}
