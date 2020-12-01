import java.io.*;
import java.util.*;
public class ex1 {
    public static void main(String[] args) {
        File file;
        Scanner userScanner = new Scanner(System.in);
        Scanner fileScanner;
        System.out.print("FILE NAME: ");
        String fName = userScanner.nextLine();
        int total = 0;
        try {
            file = new File(fName);
            fileScanner = new Scanner(file);
            while (fileScanner.hasNextInt()) {
                total += fileScanner.nextInt();

            }
            System.out.println(total);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
}