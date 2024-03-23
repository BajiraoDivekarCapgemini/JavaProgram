package Program_Practice_30_09_2022;

public class How_to_Remove_Junk_File_In_String {
	
	public static void main(String [] args) {
		
	String s="Abacd#@$%^&&12345";
	
	String s1=s.replaceAll("[^a-zA-Z0-9]", "");
	
	System.out.println(s1);
	
	
	String str="How r U";
	
	String str1 = str.replaceAll("\\s", "");
	System.out.println(str1);
	
	
	}	

}
