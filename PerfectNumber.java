package basicProblem;

public class PerfectNumber {

	static void perfectNum(int num) {
		int sum =0;
		for(int index=1; index < num; index++) {
			if(num%index==0)
				sum = sum + index;
		}
		if(sum==num) {
			System.out.println("perfect Number");
		}else {
			System.out.println("Not perfect Number");
		}
	}
	public static void main(String[] args) {
		perfectNum(28);
	}
}
