public class Pascal {
    public static void main(String[] args) {
        System.out.println(pascal(3,2)); // 3
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < i+1; j++) {

                System.out.print(pascal(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int pascal(int row, int col) {
        if (col == 0) return 1;
        if (row == col) return 1;
        return pascal(row-1, col-1) + pascal(row-1, col);
    }
}