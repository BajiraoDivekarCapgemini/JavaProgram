package Program_Practice_30_09_2022;

public class Prime_Number {
	
	public static void main(String [] args) {
		
		int num=6;
		int count=0;
		
		for(int n=1;n<=num;n++) {
			
			if(num%n==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Given Number is Prime");
				
			}
		else {
			System.out.println("Given Number is not Prime");
		}
		
		}
		
		
	}


