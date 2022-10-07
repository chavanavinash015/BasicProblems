package basicProblem;

public class SumOfNumRange {

	static void sumOfNumRange() {
		
		int number1 = 12;
		int number2 = 15;
		
		int Add = number1 + number2;
		int sum = Add*2;
		
		System.out.println("Adding Of Number Given Range ="+sum);
	}
	
	static void Addition(int num1, int num2) {
		int add = num1 + num2;
		int Sum = add *2;
		System.out.println("By Method Parameter ="+Sum);
	}
		
	
	public static void main(String[] args) {
		sumOfNumRange();
		Addition(12, 15);
	}
}
