package LogicalProgram;

public class Practice {
public static void main(String[] args) {
	for(int i=1;i<=10;i++) {
		int count =0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
			count++;			
		}
	}
		if(count==0) {
			System.out.println("Prime no:"+i);
		}
	}
}
}
