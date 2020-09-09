import java.util.*;
public class CentDollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the cents: ");
        int cents = scanner.nextInt();
        System.out.print("That is " + (cents/100) + " dollars and " + (cents % 100) + " cents");
        scanner.close();
    }
}