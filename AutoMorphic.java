package basicProblem;

public class AutoMorphic {

	static void autoMorphicValue(int number) {
		
		String count =Integer.toString(number);
        int r = count.length();
        double division =Math.pow(10, r);
        double res = Math.pow(number, 2);
        if(res%division==number) {
        	System.out.println("AutoMorphic");
        }else {
        	System.out.println("Not AutoMorhic");
        }
   
	}
	public static void main(String[] args) {
		autoMorphicValue(50);
	}
}
