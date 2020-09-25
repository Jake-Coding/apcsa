import java.util.*;
public class Admissions {
    public static void main(String[] args) {
        // 1 is Elite
        // 2+ is solid
        // No Nopes
        Scanner scanner = new Scanner(System.in);
        int sat;
        String satV;
        int rank;
        String rankV;
        int awards;
        String awardsV;
        String residence;
        String residenceV;
        String lastName;
        System.out.print("SAT SCORE: ");
        sat = scanner.nextInt();
        scanner.nextLine();
        satV = sat >= 1500 ? "Elite" : sat >= 1400 ? "Solid" : sat > 1200 ? "Acceptable" : "Nope";
        System.out.print("CLASS RANK: ");
        rank = scanner.nextInt();
        scanner.nextLine();

        rankV = rank > 95 ? "Elite" : rank > 90 ? "Solid" : rank > 85 ? "Acceptable" : "Nope";
        System.out.print("AWARDS: ");
        awards = scanner.nextInt();
        scanner.nextLine();

        awardsV = awards > 10 ? "Elite" : awards > 8 ? "Solid" : awards > 3 ? "Acceptable" : "Nope";
        System.out.print("STATE: ");
        residence = scanner.next();
        residenceV = residence.equals"
    }


    public static boolean acceptable(String[] ratings) {
        String[] ranks = {"Nope", "Acceptable", "Solid", "Elite"};
        if (ratings[5].equals("Padjen")) {
            return true;
        }
        int neededSolids = 2;
        for (int i = 0; i < ratings.length-1; i++) {
            if (ratings[i] == "Nope") {
                return false;
            } else if (getIndex(ranks, "Elite") <= getIndex(ranks, ratings[i])) {
                return true;
            } else if (getIndex(ranks, "Solid") <= getIndex(ranks, ratings[i])) {
                if (neededSolids != 0) {
                    neededSolids -= 1;
                } else {
                    return true;
                }
            }

        }
    
        return false;
    }

    public static int getIndex(String[] arr, String value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
}