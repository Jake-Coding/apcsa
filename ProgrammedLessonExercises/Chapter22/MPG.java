import java.util.*;
public class MPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialMiles = 0;
        double finalMiles;
        double gallons;
        while (true) {
            System.out.print("Init: ");
            initialMiles = scanner.nextDouble();
            if (initialMiles < 0) {
                break;
            }
            System.out.print("Final: ");
            finalMiles = scanner.nextDouble();
            System.out.print("Gallons: ");
            gallons = scanner.nextDouble();
            System.out.println(mpgCalc(initialMiles, finalMiles, gallons));
        }
    }
    public static double mpgCalc(double initMiles, double finalMiles, double gallons) {
        return (finalMiles - initMiles)/gallons;
    }
}