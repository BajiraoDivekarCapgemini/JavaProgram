package Program_Practice_14_10_2022;

public class CountPrimeNumber {
	
	public static int countPrimeNum(int n){

		int countPrimNum=0;
		for(int i=1;i<=n;i++){
		   int count=0;
		       for(int j=1;j<=i;j++){
		          if(i%j==0){
		              count++;
		         }
		      }
		   if(count==2){
		      countPrimNum++;
		  }
		
		}
		return countPrimNum;
	}


		public static void main(String [] agrs){

		System.out.println(countPrimeNum(10));
		}


}
