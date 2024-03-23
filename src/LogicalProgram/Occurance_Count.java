package LogicalProgram;

public class Occurance_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="java is a programming language";
		String[][] ss = occurenceCount(a);
		for(int i=0;i<ss.length;i++) {
			String word = ss[i][0];
			String count = ss[i][1];
			System.out.println(word+" = "+count);
		}
		

	}
	
	 public static String[][] occurenceCount(String a){

	        String word[]=a.split(" ");
	        String [][] words=new String[word.length][word.length];
	        for(int i=0;i<word.length;i++){
	            int count=1;
	            for(int j=i+1;j<word.length;j++){
	                if(word[i]==word[j]){
	                    count++;
	                    word[j]= "0";
	                }
	            }if(word[i]!="0"){
	            	words[i][0]=word[i];
	            	words[i][1]=String.valueOf(count);
	            }
	        }
	        return words;
	    }

}
