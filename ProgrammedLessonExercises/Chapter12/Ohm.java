import java.util.*;
public class Ohm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v, r;
        System.out.print("Voltage: ");
        v = scanner.nextDouble();
        System.out.print("\nResistance: ");
        r = scanner.nextDouble();
        System.out.print(v/r);
        scanner.close();
    }
}