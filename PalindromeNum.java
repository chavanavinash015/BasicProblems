package Com.BridgeLabz.Day2Problems;

public class PalindromeNum {
    static void palindromeNum(int num) {
        int rem, reverse=0;
        int CheckNum = num;
        while(num!=0) {
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        System.out.println(reverse);

        if(CheckNum==reverse) {
            System.out.println("this is Palindrome Number");
        }else {
            System.out.println("Not a Palindrome Number");
        }

    }
    public static void main(String[] args) {
        palindromeNum(121);
    }
}
