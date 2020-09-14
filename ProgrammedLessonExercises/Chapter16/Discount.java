import java.util.*;
public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Price in cents: ");
        int cents = scanner.nextInt();
        int finalPrice = cents;
        if (cents > 1000) {
            finalPrice *= 0.9;
        }
        System.out.println(finalPrice);
    }
}