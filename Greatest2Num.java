package basicProblem;

public class Greatest2Num {
	static void greatestNum(int num1, int num2) {
     
		if(num1>num2) {
			System.out.println(num1);
		}else if(num1<num2) {
			System.out.println(num2);
		}else {
			System.out.println("Equal");
		}
	}
	public static void main(String[] args) {
		greatestNum(12, 3);
	}
}
