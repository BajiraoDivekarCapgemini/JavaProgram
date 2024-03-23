package Program_Practice;

public class Print_1_To_100_Without_Loop {
	
	public static void recursivfun(int n) {
		  if(n>=1) {
			System.out.println(n);
			recursivfun(n-1);
			
		}
		
	}
	public static void main(String[] args) {
		recursivfun(50);
		
	}

}
