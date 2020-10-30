import java.util.*;
public class FactFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long i;
        System.out.print("i: ");
        i = scanner.nextLong();
        long f = fact(i);
        if (f == -1) {
            System.out.println("Your input was too big or too small! Smh my head.");
        } else {
            System.out.println(f);
        }
    }
    public static long fact(long i) {
        if (i > 20 || i < 0) {return -1;}
        long sum = 1;
        for (long j = i; j > 1; j--) {
            sum *= j;

        }
        return sum;
    }   
}
    
