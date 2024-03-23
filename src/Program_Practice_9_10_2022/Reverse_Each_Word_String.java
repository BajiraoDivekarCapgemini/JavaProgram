package Program_Practice_9_10_2022;

public class Reverse_Each_Word_String {
	
	public static void main(String [] agrs) {
		
		
		String str="Love You India";
		
		String rev="";
		
		String[] words = str.split(" ");
		
		for(int i=words.length-1;i>=0;i--) {
			
			rev=rev+words[i]+" ";
		}
		
		System.out.println(rev);
		
	}

}
