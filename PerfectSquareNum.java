package basicProblem;

public class PerfectSquareNum {

	static void perfectSquareCheck(int number) {
		
		for(int index=1; index<number/2; index++) {
			if(index*index==number) {
				System.out.println("Given Number is Square of "+index);
			}
		}
	}
	public static void main(String[] args) {
		perfectSquareCheck(25);
	}
}
