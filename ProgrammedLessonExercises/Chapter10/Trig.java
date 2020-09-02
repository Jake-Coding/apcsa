import java.util.*;
public class Trig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Deg: ");
        double angle = scanner.nextDouble();
        angle = DtoR(angle);
        System.out.println("sin^2 + cos^2 = 1");
        System.out.println(Math.sin(angle)* Math.sin(angle) + Math.cos(angle) * Math.cos(angle));
        scanner.close();
    }
    public static double DtoR(double degrees) {
        return degrees * Math.PI/180;
    }
}