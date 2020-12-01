import java.io.*;
import java.util.*;
public class ex2 {
    public static void main(String[] args) {
        Scanner fileScanner;
        Scanner userInput = new Scanner(System.in);
        File file;
        System.out.print("FILE: ");
        String fname = userInput.nextLine();
        try {
            file = new File(fname);
            fileScanner = new Scanner(file);
            String line = fileScanner.nextLine();
            int tot = 0;
            while (fileScanner.hasNextLine()) {
                if (!fileScanner.hasNext("next")) {
                    tot += fileScanner.nextInt();
                } else {
                    System.out.println(tot);
                    tot = 0;
                    fileScanner.next();
                }
            }
            System.out.println(tot);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}