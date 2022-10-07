package basicProblem;

public class PowerOfNum {

	static void powerOfNumber(int base) {
		
		int power = 2 ;
		int result= 1;
		while(power  != 0) {
			 result *= base;
			power--;
		
    	System.out.println("Result = "+result);
		}
	}
	static void powerNum(int value) {
	    double pow1 = 2;
	//	double pow2 = 2;
		double res1,res2;
		
		res1= Math.pow(value, pow1);
	//	res2= Math.pow(value, pow2);
		System.out.println(res1);
	}
	
	
	public static void main(String[] args) {
		powerOfNumber(2);
		powerNum(4);
	}
}
