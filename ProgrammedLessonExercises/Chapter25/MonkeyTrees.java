public class MonkeyTrees {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            String numWord = i == 5 ? "Five" : i == 4 ? "Four" : i==3 ? "Three" : i==2 ? "Two" : "One";
            System.out.println(numWord + " little monkeys swinging in a tree");
            System.out.println("Teasing Mr Crocodile \"you can't catch me\"");
            System.out.println("Along came the crocodile as quiet as can be");
            System.out.println("and SNAP!\n\n");
        }
        System.out.println("No little monkeys swinging in a tree\nNo little monkeys swinging in a tree");
    }
}