package Program_Practice_9_10_2022;

public class Print_Even_Number {
	
	public static int printEvenNumber(int n) {
		
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println("Print Even Number: "+i);
			}
			
		}
		return n;
		
		
	}
	
	public static void main(String [] agrs) {
		printEvenNumber(50);
		
		
	}

}
