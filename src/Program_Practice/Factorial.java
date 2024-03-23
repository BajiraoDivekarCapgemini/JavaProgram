package Program_Practice;

public class Factorial {
	public static void main(String []agrs) {
		
		/*
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		
		System.out.println(fact);
		
		*/
		
		int fact=1;
		
		for(int num=5;num>=1;num--) {
			
			fact=fact*num;
		}
		System.out.println(fact);
		
	}

}
