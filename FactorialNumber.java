package basicProblem;

public class FactorialNumber {

	static void factorialNumCheck(int num) {
		int res=1;
		for(int index=2; index<=num; index++) {
			res *= index;
			System.out.println(res);
		}
	}
	
	
	public static void main(String[] args) {
		factorialNumCheck(6);
	}
}
