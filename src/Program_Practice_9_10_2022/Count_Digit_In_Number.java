package Program_Practice_9_10_2022;

public class Count_Digit_In_Number {
	
	
	public static int countDigitInNum(int num) {
		int count=0;
		int rem;
		while(num>0) {
			
			rem=num%10;
			num=num/10;
			count++;
		}
		return count;
		
		}
	
	public static void main(String [] agrs) {
		
		System.out.println(countDigitInNum(1234113));
		
	}

}
