import java.util.*;
public class Odious {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Val: ");
        long val = scanner.nextLong();
        while (val > 0) {

            System.out.println(val + " is " + (isOdious(val) ? "odious" : "evil"));
            System.out.print("Val: ");
            val = scanner.nextLong();

        }

    }

    public static boolean isOdious(long i) {
        int sum = 1;
        long next = i;
        while (next / 2 != 0) {
            sum += next % 2;
            next /= 2;
        }
        return sum % 2 == 1;
    }
}