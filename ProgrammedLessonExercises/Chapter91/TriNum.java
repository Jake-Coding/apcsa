public class TriNum {
    public static void main(String[] args) {
        System.out.println(triNum(5));
        
    }

    public static int triNum(int n) {
        if (n <= 1) return n;
        return n + triNum(n-1);
    }
}