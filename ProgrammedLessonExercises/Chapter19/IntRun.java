import java.util.*;
public class IntRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start;
        int end;
        System.out.print("Start: ");
        start = scanner.nextInt();
        scanner.nextLine();
        System.out.print("End: ");
        end = scanner.nextInt();
        scanner.close();
        while (start < end+1) {
            System.out.println(start++);
        }
    }
}