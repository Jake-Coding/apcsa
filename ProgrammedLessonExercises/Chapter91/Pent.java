public class Pent {
    public static void main(String[] args) {
        System.out.println(pentNum(4));
    }

    public static int pentNum(int n) {
        if (n == 1) return 1;
        return (3* n - 2) + pentNum(n-1);
    }
}