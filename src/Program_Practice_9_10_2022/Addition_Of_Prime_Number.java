package Program_Practice_9_10_2022;

public class Addition_Of_Prime_Number {

	public static int additionPrimeNu(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				sum = sum + i;

			}

		}
		System.out.println("addition of Prime Number is: " + sum);
		return sum;

	}

	public static void main(String[] agrs) {

		additionPrimeNu(5);

	}

}
