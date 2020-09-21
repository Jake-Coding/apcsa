import java.util.*;
public class EchoLen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.print("Word: ");
        word = scanner.nextLine();
        scanner.close();
        int wordLen = word.length();
        int i = 0;
        while (i < wordLen) {
            System.out.println(word);
            i++;
        }
    }
}