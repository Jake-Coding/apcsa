public class Trimmer {
    public static void main(String[] args) {
        String first = "   \t\tMan, strings be like   ";
        String second = first.trim();
        System.out.print("First: " + first + "\nSecond: " + second);
    }
}