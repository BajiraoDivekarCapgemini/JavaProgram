package Program_Practice;

public class Find_Maximum_Minimum_Values_In_Arrays {
	public static void main(String []args) {
		
		int [] a= {100,200,50,90,150};
		
		
		//find maximum value in array 
		int max=a[0];
		
		for(int i=0;i<=a.length-1;i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum value in arrays: "+max);
		
		
		//find minimum value in array 
		
		int min=a[0];
		
		for(int i=0;i<=a.length-1;i++) {
			
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum value in arrys: "+min);
	}

}
