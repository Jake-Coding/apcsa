import java.util.*;
public class CorrectChange {
    public static void main(String[] args) {
        Map<String, Integer> change = new HashMap();
        change.put("Dollar", 100);
        change.put("Quarter", 25);
        change.put("Dime", 10);
        change.put("Nickel", 5);
        change.put("Penny", 1);
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many cents?\n> ");
        int centTot = scanner.nextInt();
        
    }
}