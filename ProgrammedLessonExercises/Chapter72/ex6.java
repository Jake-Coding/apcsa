import java.io.*;
import java.util.*;
public class ex6 {
    public static void main(String[] args) {
        File file;
        FileWriter output;
        Scanner userScanner = new Scanner(System.in);
        Scanner fileScanner;
        System.out.print("FILE NAME: ");
        String fName = userScanner.nextLine();
        try {
            file = new File(fName);
            fileScanner = new Scanner(file);
            output = new FileWriter("ex6_output.txt");
            while (fileScanner.hasNext()) {
                String temp = fileScanner.next();
                if (temp.lastIndexOf('@') + 1 < temp.lastIndexOf('.')) {
                    output.write(temp + "\n");
                }
            }
            output.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
}