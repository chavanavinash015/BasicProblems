package basicProblem;

public class Greatest3Num {
	static void greatestNum(int num1, int num2, int num3) {
         
//		        Num1>Num2 = n1;     Num1>Num2 && Num1>Num3
//		        Num1>Num3 = n1;
//		        Num2>Num1 = n2;     Num2>Num1 && Num2>Num3
//		        Num2>Num3 = n2;
//		        Num3>Num1= n3;      Num3>Num1 && Num3>Num2
//		        Num3>Num2= n3;
		
	    if(num1>num2 && num1>num3) {
	    	System.out.println("Greater Number is "+num1);
	    }else if(num2>num1 && num2>num3) {
	    	System.out.println("Greater Number is "+num2);
	    }else if(num3>num1 && num3>num2) { 
	    	System.out.println("Greater Number is "+num3);
	    }
     }
	public static void main(String[] args) {
		greatestNum(12, 9, 14);
	}
}
