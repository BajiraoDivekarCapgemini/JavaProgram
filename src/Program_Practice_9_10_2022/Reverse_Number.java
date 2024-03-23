package Program_Practice_9_10_2022;

public class Reverse_Number {
	
	
	public static int reverseNumber(int n) {
		
		int rev=0;
		int rem;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;

			n=n/10;
			}
		return rev;
		}
	
	public static void main(String [] agrs) {
		
//		System.out.println(reverseNumber(123456));
		
/** Print first non repeting character  **/		
	     String s="arrange";
	     char[] ch=s.toCharArray();
	     for(int i=0;i<ch.length;i++){
	         //char ch1='0';
	    	 int count=1;
	         for(int j=i+1;j<ch.length;j++){
	             if(ch[i]==ch[j]){
	            	 count++;
	            	 System.out.println(ch[i]+" "+count);
//	                 ch[i]=ch1;
//	                 ch[j]=ch[i];
//	                 ch1=ch[j];
	             }
	           
	             
	         }
	         
	    
	     }
	     
//	     for(int k=0;k<ch.length;k++){
//	         if(ch[k]=='0'){
//	             System.out.println(ch[k]);
//	             break;
//	         }
//	     }
	
	/** Oval Program  **/	
		
//		String s="My name is nilesh and i am from maharashtra you";
//		int total=0;
//		int atotal=0;
//		int itotal=0;
//		int etotal=0;
//		int ototal=0;
//		int utotal=0;
//		for(int i=0;i<s.length();i++) {
//		  char	ch=s.charAt(i);
//		  if(ch=='a' || ch=='i'|| ch=='e'|| ch=='o'||ch=='u') {
//			  if(ch=='a') {
//				  atotal++;
//			  }
//			  else if(ch=='i') {
//				  itotal++;
//			  }
//			  else  if(ch=='e') {
//				  etotal++;
//	          }
//			  else  if(ch=='o') {
//				  ototal++;
//	         }
//			  else if(ch=='u') {
//				  utotal++;
//	         }
//			  else {
//				  break;
//			  }
//			 
//			  total++;
//		  }
//		
//		}
//		System.out.println("total oval"+total);
//		System.out.println("total oval of 'a'"+atotal);
//		System.out.println("total oval of 'i'"+itotal);
//		System.out.println("total oval of 'e'"+etotal);
//		System.out.println("total oval of 'o'"+ototal);
//		System.out.println("total oval of 'u'"+utotal);
		
//		String s="My!#@@$name12@#$@!(*&$^%$Ois*&*12445nilesh";
//		
//		// count of number
//		// count of special character
//		// count of oval
//		// count of consonant
//		String nu = s.replaceAll("[^0-9]", "");
//		System.out.println(nu + " =" + nu.length());
//		String sp = s.replaceAll("[A-Za-z0-9]", "");
//		System.out.println(sp + " =" + sp.length());
//		String oval = s.replaceAll("[^A-Za-z]", "").replaceAll("[^a,e,i,o,u]", "");
//		System.out.println(oval + " =" + oval.length());
//		String oval1 = s.replaceAll("[^A-Za-z]", "").replaceAll("[a,e,i,o,u]", "");
//		System.out.println(oval1 + " =" + oval1.length());
		
		
		
		
		

	}

}
