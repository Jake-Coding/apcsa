import java.util.*;
public class Modulus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("M: ");
        int m = s.nextInt();
        s.nextLine();
        System.out.print("A: ");
        int a = 0;
        int prevA = 1;
        while (a != prevA) {
            prevA = a;
            a = s.nextInt();
            s.nextLine();
            System.out.println(modulus(a, m));
            System.out.print("A: ");
        }
    }

    public static int modulus(int a, int m) {
        if (a >= 0 && a < m) return a;
        if (a >= m) return modulus(a-m, m);
        if (a < 0) return modulus(a+m, m);
        return 0;
    }
}