package Program_Practice;

public class Compiare_Array {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 50, 60 };
		
		int[] b = { 10, 20, 30, 50, 70 };
		
		if(a.equals(b)) {
			System.out.println("Both are Array are equal");
		}
		else {
			System.out.println("Both are Array not equal");
		}

	}

}
