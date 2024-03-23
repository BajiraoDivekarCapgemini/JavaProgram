package Program_Practice;

public class Count_1_to_10_Prime_Number {
	public static void main(String[] args) {

		int noPrime = 0;
		for (int i = 1; i <= 10; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				noPrime++;
			}

		}
		System.out.println("Number of Prime Number is: "+noPrime);
	}
}
