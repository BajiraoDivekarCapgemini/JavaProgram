package Program_Practice;

public class Prime_Number {
	public static void main(String[] args) {
		
		int num=6;
		int count=0;
		for(int i=1;i<=num;i++) {
			 if(num%i==0) {
					count++;
				}
		
		}

		if(count==2) {
			System.out.println("given Number is Prime");
		}
		else {
			System.out.println("Given Number is not Prime");
		}
	}

}
