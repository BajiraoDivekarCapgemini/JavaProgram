package Program_Practice;

public class Remove_Junk_OR_Special_Character_In_String {

	public static void main(String[] args) {
		
		String s="Shravani@1234%$##*&^";
		
		String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s1);
		

	}

}
