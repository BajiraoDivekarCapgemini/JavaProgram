package Program_Practice_30_09_2022;

public class Count_Prime_Number_1_To_100 {
	
	public static void main(String [] args) {
		
		int primeNumCount=0;
		for(int i=1;i<=100;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				primeNumCount++;
			}
			
		}
		System.out.println("Total Number of Prime Number from 1 to 100: "+primeNumCount);
		
	}

}
