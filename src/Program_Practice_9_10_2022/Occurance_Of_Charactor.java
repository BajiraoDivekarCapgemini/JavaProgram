package Program_Practice_9_10_2022;

public class Occurance_Of_Charactor {
	public static void main(String[] args) {
		
		
//		String s="ababac";
//		char[] s1 = s.toCharArray();
		int [] a= {1,3,5,6,3,8,1,3,5,6,9,10,3,12,15,12};
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] != '0') {
					if (a[i] == a[j]) {
						count++;
						a[j] = '0';
					}
//				}

			}
			if (a[i] != '0') {
				System.out.println(a[i] + " = " + count);

			}

		}
		
		
		
	}


}
