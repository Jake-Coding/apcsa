import java.util.*;
public class InRangeAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inRangeSum = 0;
        int outRangeSum = 0;
        int lowBound;
        int highBound;
        int input;
        System.out.print("Lower Bound: ");
        lowBound = scanner.nextInt();
        System.out.print("Higher Bound: ");
        highBound = scanner.nextInt();
        while (true) {
            System.out.print("Num: ");
            input = scanner.nextInt();
            if (input == 0) {
                break;
            } else if (input <= highBound && input >= lowBound) {
                inRangeSum += input;
            } else {
                outRangeSum += input;
            }

        }
        System.out.println("InRange: " + inRangeSum + "\nOutRange: " + outRangeSum);

    }
}