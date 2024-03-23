package Program_Practice_30_09_2022;

public class Fibonacci_Series {
	public static void main(String[] args) {
		
	
	
	int n1=0,n2=1,n3;
	
	System.out.print("Fibonacci Series: "+n1+" "+n2);
	
	for(int i=2;i<=9;i++) {
		
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
	}

}
}
