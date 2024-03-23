package Program_Practice_9_10_2022;

public class Print_Odd_Number {
	
	
	public static int printOddNumber(int n) {
		int i=1;
		while(i<=n) {
			if(i%2!=0) {
				System.out.println(i);
				}
			i++;
			
		}
		return n;
		
		
		
	}
	
	public static void main(String [] agrs) {
		
		printOddNumber(100);
		
		
	}

}
