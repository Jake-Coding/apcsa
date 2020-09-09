import java.util.*;
public class HarmonicMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y;
        System.out.print("X: ");
        x = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("\nY: ");
        y = scanner.nextDouble();
        double aMean = ((x + y) / 2.0);
        double hMean = 2.0 / ((1.0 / x) + (1.0 / y));
        System.out.println("Arithmetic mean: " + aMean + "\nHarmonic mean: " + hMean);
        scanner.close();
    }
}