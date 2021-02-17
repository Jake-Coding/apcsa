public class Recursion {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    public static int iterativeFactorial(int n) {
        int tot = 1;
        for (int i = 1; i <= n; i++) {
            tot *= i;
        }
        return tot;
    }

    public static int recursiveFactorial(int n) {
        if (n <= 1) {return n;}
        return n * recursiveFactorial(n-1);
    }
    
    public static int fib(int n) {
        if (n < 1 ) {return 1;}
        return fib(n-1) + fib(n-2);
    }
}