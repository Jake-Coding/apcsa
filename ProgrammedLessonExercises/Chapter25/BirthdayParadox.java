import java.util.*;
public class BirthdayParadox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("How many people?: ");
        n = scanner.nextInt();
        double probability = 1;
        for (int i = 1; i < n; i++) {
            probability *= (365.0-i)/365.0;
        }
        System.out.println("Probability of no shared bdays: " + probability * 100 + "%");
    }
}