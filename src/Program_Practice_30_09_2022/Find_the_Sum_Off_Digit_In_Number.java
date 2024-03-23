package Program_Practice_30_09_2022;

public class Find_the_Sum_Off_Digit_In_Number {
	public static void main(String[] args) {
		
		int num=123456;
		int rem;
		int sum=0;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
		
	}

}
