package Program_Practice_9_10_2022;

public class Swap_Two_Number {

	public static void swapTwoNum(int a, int b) {

		System.out.println("Before swap Two Number: " + "a=" + a + " b=" + b);
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swap Two Number: " + "a=" + a + " b=" + b);
		

	}

	public static void main(String[] agrs) {
		swapTwoNum(5, 10);

	}

}
