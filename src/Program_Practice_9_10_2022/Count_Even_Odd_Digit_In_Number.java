package Program_Practice_9_10_2022;

public class Count_Even_Odd_Digit_In_Number {

	public static void main(String[] args) {

		int num = 123456789;
		int even = 0;
		int odd = 0;

		while (num > 0) {

			int rem = num % 10;
			if (rem % 2 == 0) {
				even++;
			} else {
				odd++;
			}

			num = num / 10;
		}

		System.out.println("Number of Even Digit In Number: " + even);
		System.out.println("Number of Odd Digit In Number: " + odd);

	}

}
