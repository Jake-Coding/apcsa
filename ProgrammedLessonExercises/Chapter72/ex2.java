
import java.io.*;
import java.util.*;
public class ex2 {
    public static void main(String[] args) {
        File file;
        Scanner userScanner = new Scanner(System.in);
        Scanner fileScanner;
        System.out.print("FILE NAME: ");
        String fName = userScanner.nextLine();
        float total = 0;
        float sqTotal = 0;
        try {
            file = new File(fName);
            fileScanner = new Scanner(file);
            int n = 0;
            while (fileScanner.hasNextFloat()) {
                float temp = fileScanner.nextFloat();
                total += temp;
                sqTotal += temp * temp;
                n++;
            }
            float avgsq = (total / n) * (total / n);


            System.out.println(Math.sqrt(sqTotal/n - avgsq));
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
}