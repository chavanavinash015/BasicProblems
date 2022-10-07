package basicProblem;

public class PrimeNumber {

	static void checkPrimeNum(int num) {
		int count = 0;
		for(int index =1; index <=num; index++) {
		
			if(num%index==0)   // 23%1==23 , 23%23==0;
				count++;
		}
		if(count==2) {
			System.out.println("This is a Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
	}
	public static void main(String[] args) {
		checkPrimeNum(23);
	}
}
