package Com.BridgeLabz.Day2Problems;

public class ReverseNum {

    static void reverseNum(int num) {
        int reverse=0, rem;

        while(num!=0) {
            rem= num%10;   //231%10=1 ; 23%10=13 ; 2%10=132
            reverse= reverse*10+rem;
            num=num/10;
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        reverseNum(231);
    }
}

