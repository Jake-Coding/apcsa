import java.util.*;
public class MultQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        final int upperBound = 10;
        int correctAns = 0;
        Random A = new Random();
        Random B = new Random();
        while (i < 10) {
            if (question(A.nextInt(upperBound), B.nextInt(upperBound), scanner)) {
                correctAns++;
            };
            i++;
        }
        System.out.println(correctAns >= 7 ? "Pass" : "Fail");

    }
    public static boolean question(int a, int b, Scanner s) {
        int answer = a * b;
        System.out.print("What is " + a + " * " + b +": ");
        int guess = s.nextInt();
        return guess == answer;
    }
}