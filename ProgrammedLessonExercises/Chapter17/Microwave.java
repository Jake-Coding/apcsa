import java.util.*;
public class Microwave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeUserInput;
        int itemCount;
        System.out.println("Time for 1 item: ");
        timeUserInput = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Total items: ");
        itemCount = scanner.nextInt();
        scanner.close();

        int timeInSec = timeUserInput / 100 * 60 + timeUserInput % 100;
        if (itemCount > 3) {
            System.out.println("Not recommended. Cook less stuff.");
        } else if (itemCount == 3) {
            System.out.println(secondsToMins(2 * timeInSec));
        } else if (itemCount == 2) {
            System.out.println(secondsToMins((int) (1.5 * timeInSec)));
        } else {
            System.out.println(secondsToMins(timeInSec));
        }


    }
    public static String secondsToMins(int seconds) {
        return "" + seconds / 60 + ":" + seconds % 60;
    }
}