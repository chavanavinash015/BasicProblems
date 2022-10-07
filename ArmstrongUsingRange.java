package basicProblem;

public class ArmstrongUsingRange {

	 static void  checkArmValueRange(int initialLimit, int finalLimit) {
		for(int index=initialLimit; index<=finalLimit; index++) {
         boolean value=ArmstrongNumber.checkArmNum(index);                
			  
			  if(value) {
				  System.out.println(index+" ");
			  }
		}
	
	
	}
	public static void main(String[] args) {
		
		checkArmValueRange(152, 154);
		
	}
}