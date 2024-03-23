package Program_Practice_30_09_2022;

public class Factorial {
	public static void main(String [] agrs) {
		
		int num=5;
		int fact=1;
		while(num>=1) {
			
			fact=fact*num;
			num--;
		}
		
		System.out.println("Factorial of 5!:"+fact);
	}

}
