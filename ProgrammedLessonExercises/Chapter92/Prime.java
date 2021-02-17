public class Prime {
    public static void main(String[] args) {
        System.out.println(prime(101));   
        System.out.println(prime(102));
    }

    public static boolean prime(int n) {
        return prime(n, n/2);
    }
    public static boolean prime(int n, int d) {
        if (d==1) return true;
        if (n % d == 0) return false;
        return prime(n, d-1);

    }
}