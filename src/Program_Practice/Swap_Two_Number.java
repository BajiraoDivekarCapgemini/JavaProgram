package Program_Practice;

public class Swap_Two_Number {
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		/*System.out.println("Before Swaping Number is:"+" a="+ a +" b="+b);
		
		int c;
		c=b;
		b=a;
		a=c;
		
		System.out.println("After Swaping Number is:"+" a="+ a +" b="+b);
		*/
		
		
		//Without using third variable
		
		System.out.println("Before Swaping Number is:"+" a="+ a +" b="+b);
		
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		
		System.out.println("After Swaping Number is:"+" a="+ a +" b="+b);
		
		
		
		
	}

}
