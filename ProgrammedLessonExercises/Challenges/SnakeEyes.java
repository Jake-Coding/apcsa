import java.util.*;

public class SnakeEyes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random d6Gen = new Random();
        int max = 6;
        int totRolls = 0;
        int totScore = 0;
        int scoresMoreThan4 = 0;

        System.out.print("N: ");
        int n = scanner.nextInt();

        int i = 0;
        while (i < n) {
            int temporary = 0;
            int total = 0;
            int rolls = 0;

            while (temporary != 2) {
                rolls++;
                temporary = rollDice(d6Gen, max);
                if (temporary == 2) {break;}
                total += temporary;
            }

            totRolls += rolls;
            totScore += total;
            if (total > 4) {scoresMoreThan4++;}

            i++; 
        }

        System.out.println("Average rolls: " + ((double) totRolls/(double) n));
        System.out.println("Average score: " + (double) (totScore) / (double) (n));
        System.out.println("% of players with 4+ rolls: " + (double) (scoresMoreThan4) / (double) (n) * 100.0);
    }

    public static int rollDice(Random randomGen, int max) {
        return (randomGen.nextInt(max) + randomGen.nextInt(max) + 2);
    }
}