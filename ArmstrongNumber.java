package basicProblem;

public class ArmstrongNumber {

	static boolean checkArmNum(int num) {

		int result = 0;
		int value =num;
		while (num > 0) {
			int rem = num % 10;
			result = (rem * rem * rem)+result;
			num = num / 10;
		}

		if (value == result) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
	boolean b=checkArmNum(371);
		if (b) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
	}
}
