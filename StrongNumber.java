package basicProblem;

public class StrongNumber {

	static void checkStrongNumber(int num) {
		
		int strongNumber = 0;
		int storeValue = num;
		
		while(num>0) {
			int fact = 1;
			int rem = num%10;
			while(rem>=1) {
				fact = fact*rem;
				rem--;
			}
			strongNumber = fact + strongNumber;
			num=num/10;
			
		}
		if(storeValue == strongNumber) {
			System.out.println(" this is strong Number");
		}else
			System.out.println(" this is Not Strong Number");
	}
	public static void main(String[] args) {
		checkStrongNumber(145);
	}
}
