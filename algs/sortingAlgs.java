import java.util.*;
public class sortingAlgs {
    public static void main(String[] args) {
        int[] testArray = {7,5,1,3};
        System.out.println(Arrays.toString(selectionSort(testArray, 0)));
       
        testArray = new int[] {7, 5, 1, 3};
        System.out.println(Arrays.toString(insertionSort(testArray, testArray.length-1))); 

        testArray = new int[] {7, 5, 1, 3};
        System.out.println(Arrays.toString(bubbleSort(testArray))); 
    }

    public static int[] selectionSort(int[] data, int start) {
        int minIndex = start;
        if (start == data.length) {return data;}
        // get min
        for (int i = start+1; i < data.length; i++) {
            if (data[i] < data[minIndex]) {minIndex = i;}
        }
        // swap
        int temp = data[start];
        data[start] = data[minIndex];
        data[minIndex] = temp;

        // r e c u r s i o n
        return selectionSort(data, start + 1);

    }

    public static int[] insertionSort(int[] data, int start) {
        if (start == 0) {return data;}
        int minIndex = start;
        for (int i = start; i >= 0; i--) {
            if (data[i] > data[minIndex]) {
                int temp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = temp;
            }
        }
        return insertionSort(data, start-1);
    }

    public static int[] bubbleSort(int[] data) {
        boolean noSwaps = false;
        int traversals = 0;
        while (!noSwaps) {
            noSwaps = true;
            for (int i = 0; i < data.length-1; i++) {
                if (data[i] > data[i+1]) {
                    int temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                    noSwaps = false;
                }

            }
            traversals++;
            if (traversals == data.length) {break;}
        }
        return data;
 
    }
}