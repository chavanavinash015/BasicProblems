package Com.BridgeLabz.Day2Problems;

public class ReverseNumForloop {

    static void reverseNumForLoop(int num) {
        int reverse=0;
        int rem;

        for(int index=0; index <= num; index++) {
            rem= num%10;   //231%10=1 ; 23%10=13 ; 2%10=132
            reverse= reverse*10+rem;
            num=num/10;
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        reverseNumForLoop(231);
    }
}

