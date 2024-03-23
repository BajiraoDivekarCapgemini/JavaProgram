package Program_Practice_30_09_2022;

public class Count_Number_Even_Odd_Digit_In_Number {
	public static void main(String []args) {
		
		int num=123456789;
		
		int even=0;
		int odd=0;
		int rem;
		while(num>0) {
			rem=num%10;
			num=num/10;
			
			if(rem%2==0) {
				even++;
			}
			else {
				odd++;
			}
			
		}
		System.out.println("Number of even Number: "+even);
		System.out.println("Number of even Number: "+odd);
		
	}

}
