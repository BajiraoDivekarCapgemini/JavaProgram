package Program_Practice_9_10_2022;

public class Find_Max_Mini_Values_In_Arrays {
	public static void main(String[] args) {
		

	
	int [] a= {10,5,7,15,20,30};
	
	// For maximum value in Arrays
	int max = a[0];
	
	for(int i=0;i<a.length;i++) {
		
		if(a[i]>max) {
			max=a[i];
			
		}
		
		
	}
	System.out.println("Maxium value in Arrays: "+max);
	
	// For minimum value in Arrays
	
	int min=a[0];
	
for(int i=0;i<a.length;i++) {
		
		if(a[i]<min) {
			min=a[i];
			
		}
	
}
System.out.println("Maxium value in Arrays: "+min);

}
}