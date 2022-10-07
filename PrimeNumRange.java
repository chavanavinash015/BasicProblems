package basicProblem;

public class PrimeNumRange {

	static void primeNumInRange(int initialLimit, int finalLimit) {
		for(int index=initialLimit; index<=finalLimit;index++) {
		 boolean isPrime =PrimeNumber1.checkPrimeNum1(index);
		 if(isPrime)
			System.out.print(index+" ");
			
			
		}
		
	}
	public static void main(String[] args) {
		primeNumInRange(2, 10);
	}
}
