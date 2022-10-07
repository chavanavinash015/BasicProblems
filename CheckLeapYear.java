package basicProblem;

public class CheckLeapYear {

	static void checkLeapYear(int year) {
		
		if(year%4==0) {
			System.out.println("This is Leap Year");
//		}else if(year%400==0 && year/100!=0){
//			System.out.println("This is again leap year");
		}else {
			System.out.println("This is Not Leap year");
		}
		
	}
	public static void main(String[] args) {
		checkLeapYear(2000);
	}
}
