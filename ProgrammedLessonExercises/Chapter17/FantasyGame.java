import java.util.*;
public class FantasyGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strength;
        int hp;
        int luck;
        System.out.println("Name: "); // does absolutely nothing hahahahhahahhaha
        scanner.nextLine();
        System.out.println("Strength (1-10): ");
        strength = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Health (1-10): ");
        hp = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Luck (1-10): ");
        luck = scanner.nextInt();
        scanner.close();

        if (strength + luck + hp > 15) {
            strength = luck = hp = 5;
        };
        System.out.println("Str: " + strength + "\nHP: " + hp + "\nLuck: " + luck);
    }
}