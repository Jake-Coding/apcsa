public class Recursion {
    public static void main(String[] args) {
        System.out.println(reverse("apple"));
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

    public static int vowelCount(String s) {
        if (s.length() == 0) return 0;
        if (isVowel(s.substring(0,1))) {
            return 1 + vowelCount(s.substring(1));
        }
        return vowelCount(s.substring(1));

    }

    public static boolean isVowel(String s) {
        if (s.length() != 1) return false;
        return s.toLowerCase().matches("[aeiou]");
    }

    public static String reverse(String s) {
        if (s.length() <= 1) return s;
        return reverse(s.substring(1)) + s.substring(0, 1);
    }
}