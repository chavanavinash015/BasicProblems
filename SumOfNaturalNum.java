package basicProblem;

public class SumOfNaturalNum {
 
	static void sumNaturalNumber(int N) {
		int sum=0;
		for (int index =1; index <=N; index++) {
		   sum += index;
			System.out.println(sum);
			
		}
		
		
	}
	public static void main(String[] args) {
		sumNaturalNumber(5);
	}
}
