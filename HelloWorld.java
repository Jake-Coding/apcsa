import java.util.jar.Attributes.Name;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many classes? \n> ");
        int classCount = scanner.nextInt();
        classes[] classArr = new classes[classCount];
        // String[][] scheduleArray = new String[][] {{"1","Bio", "U513"}, {"2", "ASL", "U408"}, {"3", "Gov", "L504"}, {"4", "APCSA", "U428"}, {"5", "Chem", "U207"}, {"6", "English", "U317"}, {"7", "Math", "Temp 3"}}; // TEST CASE
        for (int i = 0; i<classArr.length; i++) {
            System.out.println("P" + (i+1));
            System.out.print("Class name?\n> ");
            String name = scanner.next();
            System.out.print("Roomnum?\n> ");
            String roomNum = scanner.next();
            classArr[i] = new classes(""+(i+1), name, roomNum);
        }
        scanner.close();
        for (int i = 0; i< classArr.length; i++) {
            System.out.println(classArr[i].desc());
        }
        // System.out.println("Hello World");
    }
    
}
