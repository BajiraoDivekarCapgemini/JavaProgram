package LogicalProgram;

public class Occurance {

	public static void main(String[] args) {
		String name="I am Bajirao a King";
		int size=name.length();
		char[] charArray = name.toCharArray();
		 for(int i=0;i<charArray.length;i++){
			 int count=1;
			char ch=Character.toLowerCase(charArray[i]);
		  for(int j=i+1;j<charArray.length;j++) {
			  char ch1=Character.toLowerCase(charArray[j]);
			if(ch==ch1) {
				count++;
				charArray[j]='0';
			}
			
		  }
		  if(charArray[i]!='0' && charArray[i]!=' ') {
			  System.out.println(charArray[i]+" ="+count);
		  }
		  

		} 
		 

	}

}
