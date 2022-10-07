package basicProblem;

public class SumOfDigitNum {

	static void sumOfDigitsNum() {
		
		  int sum=0;
		for(int index=1; index<=4; index++){
		//	System.out.println(index);
			 sum += index;
			System.out.println(sum);
		}
	}
	
	
	  static void sumDigits(int i, int j, int k, int l) {
			
		  int sum = i+j+k+l;
		  System.out.println(sum);
			
		}
		
	public static void main(String[] args) {
	  sumOfDigitsNum();
	  sumDigits(1,2,3,4);
	}
	
}
