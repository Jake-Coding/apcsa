import java.util.*;
public class BrickDist {
    public static void main(String[] args) {
        double g = 32.174;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Time: ");
        double t = scanner.nextDouble();
        scanner.close();
        System.out.print("Dist: " + (t *t * g * 0.5) + "ft");
    }
}