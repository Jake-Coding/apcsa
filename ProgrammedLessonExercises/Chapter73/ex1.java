import java.io.*;
import java.util.*;
public class ex1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("File name: ");
        String fileName = userInput.nextLine();
        while (!fileName.equals("quit")) {
            try {
                System.out.println(avgFile(fileName));
            } catch (Exception e) {
                e.printStackTrace();
            }
            
           System.out.print("File name: ");
           fileName = userInput.nextLine();

        }
    }


    public static double avgFile(String filename) throws Exception {
        File f = new File(filename);
        Scanner scan = new Scanner(f);
        double tot = 0;
        int n = 0;
        while (scan.hasNextDouble()) {
            tot += scan.nextDouble();
            n++;

        }
        return tot / n;
    }
}