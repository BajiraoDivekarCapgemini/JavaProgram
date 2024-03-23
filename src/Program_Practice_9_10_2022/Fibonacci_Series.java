package Program_Practice_9_10_2022;

public class Fibonacci_Series {

	public static int fibonacciSeries(int n) {

		int n1 = 0, n2 = 1, n3;
		System.out.print("Fibnocci Series: " + n1 + " " + n2 + " ");
		for (int i = 2; i < n; i++) {

			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;

		}
		return n;

	}

	public static void main(String[] agrs) {

		fibonacciSeries(10);

	}

}
