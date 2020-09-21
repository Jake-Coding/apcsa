import java.util.*;
public class RSeq {
    public static void main(String[] args) {
        int low;
        int high;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Low: ");
        low = scanner.nextInt();
        System.out.println("High: ");
        high = scanner.nextInt();
        int sum = 0;
        while (low <= high) {
            sum += low++;
            
        }
        System.out.println(sum);
        scanner.close();
    }
}