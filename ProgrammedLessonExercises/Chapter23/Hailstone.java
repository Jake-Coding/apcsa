import java.util.*;
public class Hailstone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int count = 0;
        System.out.print("N: ");
        value = scanner.nextInt();
        while (value != 1) {
            System.out.println(value);
            if (value % 2 == 0) {
                value /= 2;
            } else {
                value = 3 * value + 1;
            }
            count++;
        }
        System.out.println("It took " + count + " steps");
    }
}