import java.util.*;
public class Log {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X: ");
        double x = scanner.nextDouble();
        System.out.print("log2("+x+") = " + (Math.log(x)/Math.log(2)));


        scanner.close();
    }
}