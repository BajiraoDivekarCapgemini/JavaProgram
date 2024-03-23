package Program_Practice_30_09_2022;

public class Addition_Of_Prime_Number_From_1_To_10 {
	public static void main(String[]args) {
		int sum=0;
		for(int i=1;i<=10;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				sum=sum+i;
			}
			
		}
		System.out.println("Addition of Prime Number From 1 to 10: "+sum);
	}

}
