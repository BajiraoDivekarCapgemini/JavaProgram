package Program_Practice_9_10_2022;

public class Factorial {
	
	public static int factorial(int n) {
		
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		return fact;
	}
	
	public static void main(String [] agrs) {
		factorial(5);
		
	}

}
