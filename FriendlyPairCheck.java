package basicProblem;

public class FriendlyPairCheck {

	static void checkFriendPair(int num1, int num2) {
		
		int sum_num1=0;
		int sum_num2=0;
		
		for(int index =1; index <num1; index++) {
			if(num1%index == 0) {
				sum_num1 += index;
			}
		}
		for(int index =1; index <num2; index++) {
			if(num2%index == 0) {
				sum_num2 += index;
			}
		}
		if((sum_num1 == num2) && (sum_num2 == num1)) {
			System.out.println("there is Friendly Pair Number");
		}else {
			System.out.println("Not a Friendly Pair Number");
		}
	}
	public static void main(String[] args) {
		checkFriendPair( 6, 24);
	}
}
