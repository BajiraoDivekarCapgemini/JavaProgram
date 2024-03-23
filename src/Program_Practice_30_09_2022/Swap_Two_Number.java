package Program_Practice_30_09_2022;

public class Swap_Two_Number {
	public static void main(String [] agrs) {
		
	int a=10;
	int b=20;
	
	System.out.println("Swapping Before: "+"a=" + a +" b="+ b);
	
	/*int c;
	
	c=b;
	b=a;
	a=c;
	*/
	
	
	
	a=a+b;//30
	b=a-b;//10
	a=a-b;//20
	
	System.out.println("Swapping After: "+"a=" + a +" b="+ b);
	

	}
}
