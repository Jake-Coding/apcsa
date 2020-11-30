import java.io.*;
import java.util.*;
public class IO {
    public static void main(String[] args) {

        File file;        
        Scanner scanner;
        ArrayList<Integer> data = new ArrayList<Integer>();

        try {
            file = new File("data.csv");
            scanner = new Scanner(file);

            while (scanner.hasNextInt()) {
                data.add(scanner.nextInt());
            }
            System.out.println(data);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }      



    }
}