package basicProblem;

public class HarshadNumber {

	static void checkHarshadNum(int number) {
		int sum =0;
		int value = number;
		while(number!=0) {
			int rem = number%10;
			sum = sum + rem;
			number = number/10;
			
		}
		if(value%sum==0) {
			System.out.println("Harshad Number");
		}else {
			System.out.println("Not Harshad Number");
		}
	}
	public static void main(String[] args) {
		checkHarshadNum(10);
	}
}
