package Program_Practice_30_09_2022;

public class Reverse_each_letter_In_String_1 {
	public static void main(String[] args) {

		String str = "Welcome To My Home";

		String[] words = str.split(" ");

		String revstr = "";

		for (String w : words) {

			String revwords = "";

			for (int i = w.length() - 1; i >= 0; i--) {
				revwords = revwords + w.charAt(i);

			}
			revstr = revstr + revwords + " ";
		}
		System.out.println(revstr);

	}

}
