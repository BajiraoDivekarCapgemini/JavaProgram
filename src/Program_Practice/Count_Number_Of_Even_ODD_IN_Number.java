package Program_Practice;

public class Count_Number_Of_Even_ODD_IN_Number {
	public static void main(String[] args) {
		
		int num=837752113;
		
		int even=0;
		int odd=0;
		int rem;
		while(num>0) {
			rem=num%10;
			if(rem%2==0) {
				even++;
			}
			else {
				odd++;
			}
			num=num/10;
		}
		System.out.println("number of Even digit in Number: "+even);
		System.out.println("number of odd digit in Number: "+odd);
	}

}
