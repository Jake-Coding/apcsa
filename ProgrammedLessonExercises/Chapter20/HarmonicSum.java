import java.util.*;
public class HarmonicSum {
    public static void main(String[] args) {
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("N: ");
        n = scanner.nextInt();
        scanner.close();
        int i = 1;
        while (i <= n) {
            sum += (1.0/i);
            i++;
        }
        System.out.println(sum);
    }
}