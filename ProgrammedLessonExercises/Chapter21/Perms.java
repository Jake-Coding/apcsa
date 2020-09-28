import java.util.*;
public class Perms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N, R;
        System.out.print("N: ");
        N = scanner.nextLong();
        System.out.print("R: ");
        R = scanner.nextLong();
        System.out.println(permut(N, R));


    }
    public static long permut(long n, long r) {
        long fact = 1;
        if ( n >= 0  && r < n && r >= 0) {
          while (n > r) {
            fact = fact * n;
            n--;
          }
          return fact;
        }
        else
        {
            throw new IllegalArgumentException("Bruh");
        }
      }
}
