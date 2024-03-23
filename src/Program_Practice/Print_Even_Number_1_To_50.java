package Program_Practice;

public class Print_Even_Number_1_To_50 {
	public static void main(String[] args) {
		
		//Using While loop
		
		/*int num=1;
		while(num<=50) {
			if(num%2==0) {
				System.out.println(num);
			}
			num++;
		}*/
		
		//Addition of even Number using for loop
		
		/*for(int i=1;i<=50;i++) {
			
			if(i%2==0) {
				System.out.println(i);
			}
		}*/
		
		//Addition of odd Number
				int sum=0;
				for(int i=1;i<=50;i++) {
					if(i%2==0) {
						sum=sum+i;
						
					}
				}
				System.out.println("Addition of even Number: "+sum);

		
 }

}
