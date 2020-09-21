import java.util.*;
public class AddInts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numsToAdd;
        System.out.println("How many nums dweeb?: ");
        numsToAdd = scanner.nextInt();

        int i = 0;
        int sum = 0;
        while (i < numsToAdd) {
            System.out.print("Yo gamer gimme an int: ");
            sum += scanner.nextInt();
            scanner.nextLine();
            i++;
        }
        scanner.close();

        System.out.println(sum);
        
    }
}