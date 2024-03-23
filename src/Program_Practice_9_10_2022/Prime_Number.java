package Program_Practice_9_10_2022;

public class Prime_Number {

	public static int primeNumber(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Given Number is prime: " + n);
		} else {
			System.out.println("Given Number is not Prime: " + n);
		}
		return n;

	}

	public static void main(String[] args) {
		primeNumber(1);
	}

}
