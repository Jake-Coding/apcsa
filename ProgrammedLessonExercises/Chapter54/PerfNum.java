import java.util.*;
public class PerfNum {
    public static void main(String[] args) {
        int upperBound;
        System.out.print("Upper bound:");
        Scanner scanner = new Scanner(System.in);
        upperBound = scanner.nextInt();
        for (int i = 1; i < upperBound; i++) {
            if (isPerf(i)) {
                System.out.println(i);
            }
        }

    }
    public static boolean isPerf(int i ) {
        int sum = 0;
        for (int j = 1; j <= i/2; j++) {
            if (i % j == 0) {
                sum += j;
            }

        }
        return sum == i;
    }
}