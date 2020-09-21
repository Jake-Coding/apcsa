import java.util.*;
public class StanDev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sd;
        double avg;
        double avgSquare;
        int howManyNums;
        double xiSum = 0;
        double xi2Sum = 0;
        System.out.print("How many nums: ");
        howManyNums = scanner.nextInt();
        scanner.nextLine();
        int i = 0;
        while (i < howManyNums) {
            double temp;
            System.out.println("Num: ");
            temp = scanner.nextDouble();
            xiSum += temp;
            xi2Sum += temp * temp;
            scanner.nextLine();
            i++;
        }
        avg = xiSum / howManyNums;
        avgSquare = xi2Sum / howManyNums;
        sd = Math.sqrt(avgSquare - (avg * avg));
        System.out.println(sd);
    }
}