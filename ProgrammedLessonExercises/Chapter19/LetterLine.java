import java.util.*;
public class LetterLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.print("Word: ");
        word = scanner.nextLine();
        int i = 0;
        int stringLen = word.length();
        scanner.close();
        while (i < stringLen) {
            System.out.println(word.charAt(i++));
        }
    }
}