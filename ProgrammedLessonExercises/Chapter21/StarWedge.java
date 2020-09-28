import java.util.*;
public class StarWedge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int n = scanner.nextInt();
        while (n > 0) {
            int i = 0;
            while (i < n) {
                System.out.print("*");
                i++;
            }
            System.out.print("\n");
            n--;
        }
    }
}