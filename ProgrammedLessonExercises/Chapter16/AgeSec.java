import java.util.*;
public class AgeSec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long totSecs = 0;
        final int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        final int hoursPerDay = 24;
        final int minsPerHour = 60;
        final int secsPerMin = 60;
        final int daysPerYear = 365;
        int yearsAlive;
        int monthsAfterYear;
        int daysAfterMonth;
        System.out.println("How many years: ");
        yearsAlive = scanner.nextInt();
        System.out.println("How many additional months: ");
        monthsAfterYear = scanner.nextInt();
        System.out.println("How many additional days: ");
        daysAfterMonth = scanner.nextInt();
        totSecs += (yearsAlive * daysPerYear * hoursPerDay * minsPerHour * secsPerMin);
        for (int i = 0; i < (monthsAfterYear-1); i++) {
            totSecs += daysPerMonth[i] * hoursPerDay * minsPerHour * secsPerMin;
        }
        totSecs += (daysAfterMonth * hoursPerDay * minsPerHour * secsPerMin);

        System.out.println(totSecs/2.5e7 + "%");


        scanner.close();
    }
}