package basicProblem;

public class PrimeNumber1 {

	static boolean checkPrimeNum1(int num) {
		
		
		boolean isPrime=true;
		for(int index=2; index<num; index++) {
			if(num%index==0) {
				
				 isPrime=false;
				 break;
			}
			
		}
		return isPrime;
		
	}
	public static void main(String[] args) {
		boolean b=checkPrimeNum1(23);
		if(b) {
			System.out.println("Prime Number");
		}else
			System.out.println("Not Prime Number");
	}
}
