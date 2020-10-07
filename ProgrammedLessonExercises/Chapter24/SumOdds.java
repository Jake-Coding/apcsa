import java.util.*;
public class SumOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.print("N: ");
        N = scanner.nextInt();
        int total = 0;
        for (int i = 1; i < N; i+=2) {
            total += i;
        }
        System.out.println("For odds until N: " + total);
        total = 0;
        for (int i = 1; i < N*N; i+= 2) {
            total += i;
        }
        System.out.println("For odds until N^2: " + total);
    }
}