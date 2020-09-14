import java.util.*;
public class HeavyWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight;
        System.out.print("Weight: ");
        weight = scanner.nextInt();
        scanner.close();
        System.out.println(weight > 220 && weight < 280);
    }
}