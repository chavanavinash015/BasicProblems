package basicProblem;

public class AbundantNum {

	static void checkAbundantNum(int number) {
		int value = 0;
		
		for(int index=1; index<number; index++) {
			if(number%index==0) {
				value=value+index;
			}
		}
		if(value>number) {
			System.out.println("Abundant Number");
		}else {
			System.out.println("Not Abundant Number");
		}
	}
	public static void main(String[] args) {
		checkAbundantNum(18);
	}
}
