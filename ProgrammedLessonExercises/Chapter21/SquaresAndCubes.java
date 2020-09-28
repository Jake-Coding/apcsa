import java.util.*;
public class SquaresAndCubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lim;
        System.out.print("Lim: ");
        lim = scanner.nextInt();
        int i = 0;
        long squares = 0;
        long cubes = 0;
        while (i <= lim) {
            squares += Math.pow(i, 2);
            cubes += Math.pow(i, 3);
            i++;

        }
        System.out.println("Squares: " + squares + "\nCubes: " + cubes);
    }
}