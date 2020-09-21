import java.util.*;
public class DotWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordOne;
        String wordTwo;
        int stringLen = 30;

        System.out.print("Word one: ");
        wordOne = scanner.nextLine();
        System.out.print("Word two: ");
        wordTwo = scanner.nextLine();

        String finalStr = wordOne;
        int periodCount = stringLen - (wordOne.length() + wordTwo.length());
        int i = 0;
        while (i < periodCount) {
            finalStr += ".";
            i++;
        }
        finalStr += wordTwo;
        System.out.println(finalStr);
        System.out.println(finalStr.length());
    }
}