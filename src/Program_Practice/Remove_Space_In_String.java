package Program_Practice;

public class Remove_Space_In_String {
	public static void main(String[] args) {
		
		String s="Selenium with Java";
		
		s=s.replaceAll("\\s", "");
		
		System.out.println(s);
	}

}
