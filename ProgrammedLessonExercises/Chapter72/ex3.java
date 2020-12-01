
import java.io.*;
import java.util.*;
public class ex3 {
    public static void main(String[] args) {
        File file;
        FileWriter posWriter;
        FileWriter negWriter;
        Scanner userScanner = new Scanner(System.in);
        Scanner fileScanner;
        System.out.print("Value file: ");
        String fName = userScanner.nextLine();
        System.out.print("Positive file: ");
        String pName = userScanner.nextLine();
        System.out.print("Negataive file: ");
        String nName = userScanner.nextLine();

        try {
            file = new File(fName);
            fileScanner = new Scanner(file);
            
            posWriter = new FileWriter(pName);
            negWriter = new FileWriter(nName);
            while (fileScanner.hasNextInt()) {
                int temp = fileScanner.nextInt();
                if (temp < 0) {
                    negWriter.write("" + temp + "\n");
                } else {
                    posWriter.write("" + temp + "\n");
                }

            }
            
            posWriter.close();

            negWriter.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        } 

        
    }
}