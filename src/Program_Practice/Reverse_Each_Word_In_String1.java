package Program_Practice;

public class Reverse_Each_Word_In_String1 {
	public static void main(String []args) {
		
		String str="Love You India";
		
		String[] words=str.split(" ");//Splitting String into words
		
		String reverseString="";
		
		for(String w:words) {
			
			String reverseWords="";
			
			for(int i=w.length()-1;i>=0;i--) {
				reverseWords=reverseWords+w.charAt(i);
			}
			
			reverseString=reverseString+reverseWords+" ";
		}
		
		System.out.println(reverseString);
		
	}

}
