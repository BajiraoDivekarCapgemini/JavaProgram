package Program_Practice;

public class Addition_Of_1_To_10_Prime_Number {
	public static void main(String [] args) {		
		int add=0;
		for(int i=1;i<=10;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				add=add+i;
				}			
		}
		System.out.println("Addition of 1 to 10 prime Number is: "+add);
	}
}
