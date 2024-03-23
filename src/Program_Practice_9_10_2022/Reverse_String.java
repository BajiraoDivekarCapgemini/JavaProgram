package Program_Practice_9_10_2022;

public class Reverse_String {
	
	public static String reverseString(String name) {
		
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			
			rev=rev+name.charAt(i);
		}
		return rev;
		}
	
	
	public static void main(String [] agrs) {
		System.out.println(reverseString("Selenium"));
		
		
	}

}
