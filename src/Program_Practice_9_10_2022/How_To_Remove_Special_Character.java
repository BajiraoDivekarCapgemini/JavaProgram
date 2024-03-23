package Program_Practice_9_10_2022;

public class How_To_Remove_Special_Character {
	public static void main(String [] agrs){

		String s="Java$%*&%$#@!Selenium";

		String s1=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s1);
	}
}
