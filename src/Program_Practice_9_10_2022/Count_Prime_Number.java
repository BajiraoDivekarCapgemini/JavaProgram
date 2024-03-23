package Program_Practice_9_10_2022;

public class Count_Prime_Number {
	
	
	
	public static int countPrimeNum(int n) {
		
		int countPrimeNum=0;
		for(int i=1;i<=n;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				countPrimeNum++;
			}
		}
		System.out.println("Count Prime Number: "+countPrimeNum);
		return countPrimeNum;
		
		
	}
	
	
	public static void main(String [] agrs) {
		countPrimeNum(10);
		
	}

}
