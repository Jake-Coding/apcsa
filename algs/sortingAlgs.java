import java.util.*;
public class sortingAlgs {

    public static int[] selectionSort(int[] data, int startLowBound) {
        int start = startLowBound;
        // break condition
        if (start == data.length) {return data;}

        int minIndex = start;
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

    public static int[] insertionSort(int[] data, int startUpperBound) {
        int start = startUpperBound;
        // break condition
        if (start == 0) {return data;}

        int minIndex = start;
        // the swappening
        for (int i = start; i >= 0; i--) {
            if (data[i] > data[minIndex]) {
                int temp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = temp;
            }
        }

        // r e c u r s i o n
        return insertionSort(data, start-1);
    }

    public static int[] bubbleSort(int[] data) {
        // break conditions
        boolean noSwaps = false;
        int traversals = 0;


        while (!noSwaps) {
            noSwaps = true;
            // the swappening
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

        // no recursion ;-;
        return data;
 
    }
}