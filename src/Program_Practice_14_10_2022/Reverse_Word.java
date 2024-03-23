package Program_Practice_14_10_2022;

public class Reverse_Word {

	public static void main(String[] args) {
		String ip = "Selenium java git tool";

		String[] words = ip.split(" ");
		String op = "";
		for (int i = words.length - 1; i >= 0; i--) {
			op = op + words[i] + " ";
		}
		System.out.println(op);

	}

}
