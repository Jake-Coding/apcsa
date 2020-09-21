import java.util.*;
public class TriNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n;
        System.out.print("N: ");
        n = scanner.nextLong();
        int i = 0;
        long sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println(sum);
        System.out.println((n * (n+1))/2);
    }
}