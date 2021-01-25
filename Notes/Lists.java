import java.util.*;

public class Lists {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> arrList = new ArrayList<String>(); // ONLY CLASS PARAMETERS
        arrList.add("apple");
        arrList.add("blueberry");
        print(arrList);

        arrList.get(0); // apple
        arrList.set(1, "blueberryn't"); // {apple, blueberryn't}
        print(arrList);
        arrList.size(); // 2

        for (String s : arrList) {
            System.out.println(s);
        }

        Collections.sort(arrList); // in place nlogn

        LinkedList<String> linkedListsPog = new LinkedList<String>();
        linkedListsPog.add("LINKED LISTS!!!!!!!!!!!!! YASSS QUEEN");
        

    }

    public static void print(ArrayList<String> arg) {

        String s = "[";
        for (int i = 0; i < arg.size(); i++) {
            s += arg.get(i) + ", ";
        }
        s = s.substring(0, s.length()-2);
        s += "]";
        System.out.println(s);
    }
}