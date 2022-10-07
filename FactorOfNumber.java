package basicProblem;

public class FactorOfNumber {

	static void factorOfNum(int num) {
		
		for(int index=1; index<=num; index++) {
			if(num%index==0) {
				System.out.print(index+" ");
			}
		}
	}
	public static void main(String[] args) {
		factorOfNum(10);
	}
}
