package basicProblem;

public class FibonacciSeries {

	static void fibonacciNumbers(int num) {
		int a=0;
		int b=1,Sum;
		for (int index = 0; index<=num; index++) {
	//		System.out.print(index+" ");		
				Sum = a + b;
				a = b;
				b = Sum;
				System.out.print(Sum+" ");
		}
	}
	public static void main(String[] args) {
		fibonacciNumbers(4);
	}
}
