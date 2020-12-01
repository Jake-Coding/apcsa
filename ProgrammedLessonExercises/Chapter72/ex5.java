 import java.io.*;
import java.util.*;
public class ex5 {
    public static void main(String[] args) {
        File file;
        FileWriter output;
        Scanner userScanner = new Scanner(System.in);
        Scanner fileScanner;
        System.out.print("FILE NAME: ");
        String fName = userScanner.nextLine();
        String[] badWords = {"a ", "an " , "the "};
        try {
            output = new FileWriter("ex5_output.txt");
            file = new File(fName);
            fileScanner = new Scanner(file);
            while (fileScanner.hasNext()) {
                String temp = fileScanner.nextLine();
                output.write(parseLine(temp, badWords) + "\n");

                

            }
            output.close();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }

    public static String parseLine(String line, String[] badWords) {
        String fixed = line;
        for (String badWord : badWords) {
            if (fixed.contains(badWord)) {
                fixed = fixed.replaceAll(badWord, "");
            }
            
        }
        System.out.println(fixed);
        return fixed;
    }
}