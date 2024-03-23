package Program_Practice_30_09_2022;

public class Count_Number_Of_Digit_In_Number {
	public static void main(String [] args) {
		
		int num=82345671;
		
		String num1 = String.valueOf(num);
		
		System.out.println(num1.length());
		
		
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
		
		
		
		
	}

}
