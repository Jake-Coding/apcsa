public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(25, 55));
        System.out.println(gcd(6,9));
    }
    public static int gcd(int a, int b) {
        if (a== 0) return b;
        return gcd(b%a, a);
    }
}