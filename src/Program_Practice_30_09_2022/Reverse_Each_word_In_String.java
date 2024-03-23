package Program_Practice_30_09_2022;

public class Reverse_Each_word_In_String {
	public static void main(String [] args) {
		
		String str="Java is Programming langauge";
		
		String[] words = str.split(" ");
		
		String revStr="";
		for(int i=words.length-1;i>=0;i--) {
			revStr=revStr+words[i]+" ";
			
		}
		System.out.println(revStr);
	}

}
