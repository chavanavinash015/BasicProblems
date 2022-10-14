package Com.BridgeLabz.Day2Problems;

public class SumForLoop {
    static void sumOfNaturalNum(int num) {
        int Sum = 0;
        for(int index = 1; index<=num ; index++) {
             Sum = Sum + index;
            System.out.println(Sum);
        }
    }
    public static void main(String[] args) {
        sumOfNaturalNum(5);
    }
}

