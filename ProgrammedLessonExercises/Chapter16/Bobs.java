import java.util.*;
public class Bobs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int boltPrice = 5;
        final int nutPrice = 3;
        final int wPrice = 1;
        int boltCount;
        int nutCount;
        int wCount;
        System.out.print("Bolts: ");
        boltCount = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nuts: ");
        nutCount = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Washers: ");
        wCount = scanner.nextInt();
        


        if (nutCount < boltCount) {
            System.out.println("Check the Order: too few nuts");
        } else if (2 * wCount < boltCount) {
            System.out.println("Check the Order: too few washers");
        } 
        System.out.println(boltPrice * boltCount + nutPrice * nutCount + wPrice * wCount);
        scanner.close();
    }
}