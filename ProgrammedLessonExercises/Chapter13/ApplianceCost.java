import java.util.*;
public class ApplianceCost {
    public static void main(String[] args) {
        double price, used;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cost per kWH in cents: ");
        price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("\nkWH used/year: ");
        used = scanner.nextDouble();
        scanner.close();
        double tot = (price/100) * used;
        System.out.println("$" + tot);
    }
}