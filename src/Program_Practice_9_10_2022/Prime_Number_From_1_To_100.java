package Program_Practice_9_10_2022;

public class Prime_Number_From_1_To_100 {

	public static int primeNumber(int n) {

		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println("Prime Number is: " + i);
			}
		}
		return n;
		

	}

	public static void main(String[] agrs) {
		primeNumber(10);

	}

}
