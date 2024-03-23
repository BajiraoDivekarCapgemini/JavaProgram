package Program_Practice_9_10_2022;

public class Print_1_To_100_Without_Loop {
	
	
	
	public static void recursive(int n) {
		
		if(n<=100) {
			System.out.println(n);
			recursive(n+1);
		}
		
		
	}
	
	public static void main(String [] agrs) {
		recursive(1);
		
		
		
	}

}
