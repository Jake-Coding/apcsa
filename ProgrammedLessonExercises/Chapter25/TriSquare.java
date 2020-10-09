public class TriSquare {
    public static void main(String[] args) {
        int upperBound = 50000;
        for (int i = 1; i < (int) (Math.sqrt(upperBound)); i++) {
            int squareI = i * i;
            // System.out.println(i);
            for (int j = 0; j <= squareI/2; j++) {
                if (j*(j+1) / 2 == squareI) {
                    System.out.println(squareI + " is both triangular and square");
                }
            }
        }
    }
}