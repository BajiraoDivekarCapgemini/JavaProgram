package Program_Practice;

public class Find_Sum_Of_Digit_In_Number {
	public static void main(String[] args) {
		
		int num=95035435;
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
