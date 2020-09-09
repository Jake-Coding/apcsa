import java.util.*;
public class CorrectChange {
    public static void main(String[] args) {
        Map<String, Integer> change = new HashMap<String, Integer>();
        change.put("Dollar", 100);
        change.put("Quarter", 25);
        change.put("Dime", 10);
        change.put("Nickel", 5);
        change.put("Penny", 1);
        String[] order = {"Dollar", "Quarter", "Dime", "Nickel", "Penny"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many cents?\n> ");
        int centTot = scanner.nextInt();
        scanner.nextLine();
        int moneyLeft = centTot;
        int[] changeAmts = new int[5];
        for (int i = 0; i < order.length; i++) {
            String currName = order[i];
            int currValue = (change.get(currName).intValue());
            // System.out.println(currValue);
            // System.out.println(moneyLeft / currValue);
            changeAmts[i] = (moneyLeft / currValue);
            // System.out.println(changeAmts[i]);
            moneyLeft  = moneyLeft % currValue;
            // System.out.println(moneyLeft);

        }
        for (int i = 0; i < order.length; i++) {
            System.out.println(changeAmts[i] + " " + order[i]);
        }
        scanner.close();

        
    }
}