import java.util.*;
public class InternetDeli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item;
        double price;
        boolean expressDelivery;
        System.out.println("Item name: ");
        item = scanner.nextLine();
        System.out.println("Price in dollars: ");
        price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Overnight delivery (true or false): ");
        expressDelivery = scanner.nextBoolean();

        int deliveryPrice = 0;
        if (expressDelivery) {
            deliveryPrice += 3;
        }
        if (price < 10.0) {
            deliveryPrice += 2;
        }
        scanner.close();
        System.out.println("Invoice:\n"+item+"\nDelivery: "+deliveryPrice+"\nTotal: "+(deliveryPrice + price) );
    }
}