import java.io.*;
import java.util.*;
public class ex4 {
    public static void main(String[] args) {
        File file;
        Scanner userScanner = new Scanner(System.in);
        Scanner fileScanner;
        System.out.print("FILE NAME: ");
        String fName = userScanner.nextLine();
        int yTotal = 0;
        int xTotal = 0;
        try {
            file = new File(fName);
            fileScanner = new Scanner(file);
            while (fileScanner.hasNext()) {
                if (fileScanner.hasNext("x=")) {
                    fileScanner.next();
                    xTotal += fileScanner.nextInt();
                } else {
                    fileScanner.next();
                    yTotal += fileScanner.nextInt();
                }

            }
            System.out.println("X:"+xTotal);
            System.out.println("Y:"+yTotal);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
}