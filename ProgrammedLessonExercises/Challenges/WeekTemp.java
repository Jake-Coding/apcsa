import java.util.*;
public class WeekTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dayNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] dayTemps = new int[7];
        for (int i = 0; i < dayTemps.length; i++) {
            System.out.print("Input temperature for " + dayNames[i] + "\n> ");
            dayTemps[i] = scanner.nextInt();
        }
        for (int i = 0; i < dayTemps.length; i++) {
            System.out.println(dayNames[i] + ": " + dayTemps[i] + "F");
        }
    } 
}