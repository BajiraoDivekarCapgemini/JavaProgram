package Program_Practice;

public class Print_Prime_Number_From_1_To_10 {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("Prime Number: "+i);
			}
		}		
	}
}
