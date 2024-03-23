package Program_Practice;

public class Count_Number_Digit_In_Number {

	public static void main(String[] args) {
		
		
		
		int num=19876534;
		
		int count=0;
		
		while(num>0) {
			num=num/10;
			count++;
		}
		
		System.out.println(count);

	}

}
