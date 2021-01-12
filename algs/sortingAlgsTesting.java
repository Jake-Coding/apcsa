import java.util.*;
public class sortingAlgsTesting {
    public static Random random = new Random();
    public static final int NUM_TESTS = 10000;
    public static final int TEST_DATA_SIZE = 100;
    public static final int RAND_RANGE = 100;


    public static void main(String[] args) {
        testSort("selection", NUM_TESTS);
        testSort("insertion", NUM_TESTS);
        testSort("bubble", NUM_TESTS);
    }

    public static void testSort(String method, int times) {
        for (int test = 0; test < times; test++) {
            int[] data = createTestData(TEST_DATA_SIZE);
            int[] ogData = duplicate(data);

            sortUsing(data, method);
            if (!isSorted(data)) {
                printSortErrorMessage(method, data, ogData);
                return;
            }
        }
        System.out.println("All tests correct for " + method + "\n");
    }
    public static void sortUsing(int[] data, String method) {
        switch(method.toLowerCase()) {
            case "selection":
                data = sortingAlgs.selectionSort(data, 0);
                return;
            case "insertion":
                data = sortingAlgs.insertionSort(data, data.length-1);
                return;
            case "bubble":
                data = sortingAlgs.bubbleSort(data);
                return;
            default:
                return;
        }
    }

    public static void printSortErrorMessage(String method, int[] data, int[] original) {
        System.out.println("Error during " + method);
        System.out.println("Original data: ");
        System.out.println(Arrays.toString(original));
        System.out.println("After sort: ");
        System.out.println(Arrays.toString(data));
        System.out.println();
    }

    public static int[] createTestData(int count) {
        int[] data = new int[count];
        for (int i = 0; i < count; i++) {
            data[i] = random.nextInt(RAND_RANGE);
        }
        return data;
    }

    public static int[] duplicate(int[] data) {
        int[] dup = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            dup[i] = data[i];
        }
        return dup;
    }

    public static boolean isSorted(int[] data) {
        for (int i = 0; i < data.length-1; i++) {
            if (data[i+1] < data[i]) return false;
        }
        return true;
    }


}