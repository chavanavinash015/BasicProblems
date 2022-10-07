package basicProblem;

public class SumOfNaturalNum2 {

	static void sumOfNaturalNumber(int N) {
		int sum = 0;
		for (int index = 0; index <= N; index++) {
			sum += index;
			System.out.println(sum +"   Natural Number");
		}

	}
	public static void main(String[] args) {
		sumOfNaturalNumber(6);
	}
}
