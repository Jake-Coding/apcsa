import java.util.*;
public class Combinations {
    public static void main(String[] args) {
        long n;
        long r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("N: ");
        n = scanner.nextLong();
        System.out.println("R: ");
        r = scanner.nextLong();
        System.out.println("nCr = " + combos(n, r));
        
    }

    public static long combos(long n, long r) {
        return fact(n, r)/fact(r);
    }

    public static long fact(long i) {
        if (i > 20) {return -1;}
        long sum = 1;
        for (long j = i; j > 1; j--) {
            sum *= j;

        }
        return sum;
    }

    public static long fact(long i, long lowerBound) {
        if (i > 20) {return -1;}
        long sum = 1;
        for (long j = i; j > lowerBound; j--) {
            sum *= j;

        }
        return sum;
    }
}