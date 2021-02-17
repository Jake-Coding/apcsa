public class MaxElm {
    public static void main(String[] args) {
        System.out.println(max(new int[] {3,5,1,3,9,1,-3})); // 9
    }

    public static int max(int[] arr) {
        return max(arr, arr[0], 1);
    }
    
    public static int max(int[] arr, int currMax, int index) {
        if (index == arr.length) return currMax;
        if (arr[index] > currMax) return max(arr, arr[index], index+1);
        return max(arr, currMax, index+1);
    }
}