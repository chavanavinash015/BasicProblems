package Com.BridgeLabz.Day2Problems;

public class SumOfNumbers {
    public static void main(String[] args) {
        int N = 5;
        int Sum = 1;
        int index = 1;
        while(index <= N) {
            index++;
          System.out.print(index+" ");
             Sum += index;
        }
        System.out.println("Sum of Number "+Sum);
    }
}
