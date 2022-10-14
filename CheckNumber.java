package Com.BridgeLabz.Day2Problems;

public class CheckNumber {
    public static void main(String[] args) {
        int num= 100;
        if(num == 1000){
            System.out.println("Print Ten Hundred");
        } else if(num == 100) {
            System.out.println("Printed one Hundred");
        }else if(num == 10){
            System.out.println("Print tens Numbers");
        }else
            System.out.println("print unit digits");
    }
}
