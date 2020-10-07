import java.util.*;
public class SumDivs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int N;
        System.out.print("N: ");
        N = scanner.nextInt();
        for (int i = 1; i <= N/2; i++) {
            if (N % i == 0) {
                total += i;
            }
        }
        System.out.println("The sum of the divisors of " + N + " is " + total);
        System.out.println(N + " is "+ (total != N ? "not " : "") + "a perfect number");
    }
}