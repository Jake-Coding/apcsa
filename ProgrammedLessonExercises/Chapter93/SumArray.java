public class SumArray {
    public static void main(String[] args) {
        int[] testarr = {3,5,6,1,-5,3};
        System.out.println(sum(testarr));
    }

    public static int sum(int[] array) {
        return sum(array, 0);
    }

    public static int sum(int[] array, int index) {
        if (index == array.length) return 0;
        return array[index] + sum(array, index+1);
    }
}