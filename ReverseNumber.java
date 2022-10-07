package basicProblem;

public class ReverseNumber {

	static void reverseNum(int num) {
		int reverse=0, rem;
		
		while(num!=0) {
			rem= num%10;   //1234%10=4 ; 123%10=43 ; 12%10=432 ; 1%10=4321 
			reverse= reverse*10+rem;
			num=num/10;			
		}
		System.out.println(reverse);
	}
	public static void main(String[] args) {
		reverseNum(1234);
	}
}
