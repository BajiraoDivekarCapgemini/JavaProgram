package Program_Practice_30_09_2022;

public class Prime_Number1 {
	public static void main(String [] agrs) {
		
		int num=6;
		int count=0;
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Given Number is Prime");
		}
		else {
			System.out.println("Given Number is Not Prime");
		}
		
	}

}
