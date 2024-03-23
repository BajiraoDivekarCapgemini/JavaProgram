package Program_Practice_9_10_2022;

public class Product_Of_Number_From_1_To_10 {

	public static void main(String[] agrs) {

		int n = 1;
		int product = 1;

		// Using While loop
		/*
		 * while (n <= 5) {
		 * 
		 * product = product * n; n++;
		 * 
		 * } System.out.println(product);
		 */
		
		
		
		for(int i=1;i<=5;i++) {
			product = product * i;
			
		}
		System.out.println(product);
	}

}
