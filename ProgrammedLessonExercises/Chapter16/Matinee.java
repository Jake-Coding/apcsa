import java.util.*;
public class Matinee {
    public static void main(String[] args) {
        int age;
        int time;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Time: ");
        time = scanner.nextInt();
        boolean child = age <= 13;
        boolean matineeTime = time <  1700;
        int price = 0;
        if (child) {
            price = matineeTime ? 2 : 4;
        } else {
            price = matineeTime ? 5 : 8;
        }
        System.out.println(price);
    }
}