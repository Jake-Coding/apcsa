import java.util.*;

public class QValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X: ");
        double x = scanner.nextDouble();
        System.out.print("At X = " + x + " f(x) = " + quad(x));
        scanner.close();
    }
    public static double quad(double x) {
        return (3 * Math.pow(x,2) - 8*x + 4);
    }
}