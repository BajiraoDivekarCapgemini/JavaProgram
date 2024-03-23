package Program_Practice;

public class Searching_Elements_Arrays {

	public static void main(String[] args) {
		
		int [] a= {10,15,60,30,40,10,20};
		
		int search=20;
		boolean flag = false;
		for(int i=0;i<=a.length-1;i++) {
			
			if(search==a[i]) {
				System.out.println("Element Found at:"+ i);
				flag=true;
			}			
		}		
		if(flag==false) {
			System.out.println("Element Found not at:");
		}	
	}
}
