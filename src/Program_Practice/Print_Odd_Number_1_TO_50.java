package Program_Practice;

public class Print_Odd_Number_1_TO_50 {

	public static void main(String[] args) {
		
		//Print odd Number from 1 to 50
		
		/*for(int i=1;i<=50;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}*/
		
		//Addition of odd Number
		int sum=0;
		for(int i=1;i<=50;i++) {
			if(i%2!=0) {
				sum=sum+i;
				
			}
		}
		System.out.println("Addition of odd Number: "+sum);

	}

}
