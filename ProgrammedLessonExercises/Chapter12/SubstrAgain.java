import java.util.*;
public class SubstrAgain {
    public static void main(String[] args) {
        String originalString;
        Scanner scanner = new Scanner(System.in);
        System.out.print("String: ");
        originalString = scanner.nextLine();
        int beginIndex, endIndex;
        System.out.print("\nBeginning index: ");
        beginIndex = scanner.nextInt();
        scanner.nextLine();
        System.out.print("\nEnding index: ");
        endIndex = scanner.nextInt();

        String newString = originalString.substring(beginIndex,endIndex);
        System.out.println(newString);
        scanner.close();
    }
}