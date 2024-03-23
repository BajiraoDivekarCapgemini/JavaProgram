package Program_Practice_9_10_2022;

public class Find_Sum_Digit_In_Number {
	
	public static int sumDigitInNum(int num) {
		int rem;
		int sum=0;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		return sum;
		
		}
	
	
	public static void main(String [] agrs) {
		
		System.out.println(sumDigitInNum(123456));
		
	}

}
