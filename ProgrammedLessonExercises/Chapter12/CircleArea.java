import java.util.*;
public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the radius: ");
        int r = scanner.nextInt();
        System.out.print(r * r * Math.PI);
        scanner.close();
    }
}