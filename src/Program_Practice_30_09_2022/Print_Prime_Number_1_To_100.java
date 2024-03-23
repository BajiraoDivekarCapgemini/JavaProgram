package Program_Practice_30_09_2022;

public class Print_Prime_Number_1_To_100 {
	public static void main(String[] args) {
		
	
	
	for(int i=1;i<=100;i++) {
		int count=0;
		
		for(int j=1;j<=i;j++) {
			
			if(i%j==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime Number from 1 to 100 is:"+i);
		}
		
	}

}
}
