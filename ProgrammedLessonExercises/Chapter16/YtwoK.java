import java.util.*;
public class YtwoK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birthYear;
        int currYear;
        System.out.print("Birth year: ");
        birthYear = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Current year: ");
        currYear = scanner.nextInt();
        if (currYear == 0) {
            currYear = 100;
        }
        scanner.close();
        int guess = currYear - birthYear;
        if (guess < 0) {
            guess = 100+guess;
        }
        System.out.println(Math.abs(guess));
    }
}