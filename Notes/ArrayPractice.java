import java.util.*;

public class ArrayPractice {

    public static void main(String[] args) {

        // ordered data
        // syntax: type[] name;
        // ways to initialize: 
            // {value1, value2, etc} (on declaration)
            // new type[] {value1, value2} (on declaration)
            // new type[size] (anytime)
        boolean testing_jan5 = false;
        if (testing_jan5) {
            int[] numbers = new int[8];

            numbers[0] = 3;
            numbers[0] += 3; // 6

            // iterating over arrays
                int ii = 0; // scope is annoying
                while (ii < numbers.length) {
                    System.out.println(numbers[ii]);
                    ii++;
                }

                for (int j = 0; j < numbers.length; j++) {
                    System.out.println(numbers[j]);
                }

                for (int num : numbers) {
                    System.out.println(num);
                }

            // solving a problem (counting nines)
            int[] nums = {2, 4, 8, 9, 9, 10};

            int nineCount = 0;
            for (int num : nums) {
                if (num == 9) nineCount++;
            }
            System.out.println(nineCount);


            // looking for [2,3]
            int[] nums2 = {1,3,5,2};
            boolean found = false;
            for (int i = 0; i < nums2.length - 1; i++) {
                if (nums2[i] == 2 && nums2[i+1] == 3) {
                    found = true;
                    break;
                }
            }

        }
        boolean testing_jan6 = false;
        if (testing_jan6) {
            int[] testing_array = {1,3,5,7};
            printArray(testing_array); // 1 3 5 7
            swapEnds(testing_array);
            printArray(testing_array); // 7 3 5 1
            System.out.println(hasSeven(testing_array)); // true
            System.out.println(mean(testing_array)); // 4.0
            reverse(testing_array);
            printArray(testing_array); // 1 5 3 7 
        }
        boolean testing_jan7 = true;
        if (testing_jan7) {
            int[] testing_array = {5,3,1,7};
            sort(testing_array, 0, 3);
            printArray(testing_array);
        }
    }

    public static void printArray(int[] nums) {
        // System.out.println(nums); // memory address
        System.out.println(Arrays.toString(nums)); // array vals
    }

    public static void swapEnds(int[] data) {
        int temp = data[data.length-1];
        data[data.length-1] = data[0];
        data[0] = temp;
    }

    public static boolean hasSeven(int[] data) {
        for (int num : data) {
            if (num == 7) return true;
        }
        return false;
    }

    public static double mean(int[] data) {
        int tot = 0;
        for (int num : data) {
            tot += num;
        }
        return (double) tot / (double) data.length;
    }

    public static void reverse(int[] data) {
        for (int i = 0; i < (data.length / 2); i++) {
            int temp = data[data.length-i-1];
            data[data.length-i-1] = data[i];
            data[i] = temp;
        }

    }

    public static int search(int[] haystack, int needle) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {return i;}
        }
        return -1;
    }



    public static void sort(int[] data, int leftBound, int rightBound) {
        if (leftBound < rightBound) {
            int middleBound = (leftBound + rightBound) / 2;
            sort(data, leftBound, middleBound);
            sort(data, middleBound+1, rightBound);
            combine(data, leftBound, middleBound, rightBound);
        }
    }
    public static void combine(int[] data, int left, int mid, int right) {
        int[] leftArr = new int[mid+1-left];
        int[] rightArr = new int[right-mid];

        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = data[i + left];
        }
        for (int i = 0; i < rightArr.length; i++) {
            rightArr[i] = data[i + 1 + mid];
        }

        int li = 0;
        int ri = 0;
        for (int i = left; i < right+1; i++) {
            if (li < leftArr.length) {
                if (ri < rightArr.length) {
                    if (leftArr[li] < rightArr[ri]) {
                        data[i] = leftArr[li];
                        li++;
                    } else {
                        data[i] = rightArr[ri];
                        ri++;
                    }
                } else {
                    data[i] = leftArr[li];
                    li++;
                }
            } else if (ri < rightArr.length) {
                data[i] = rightArr[ri];
                ri++;
            }
        }
    }

}
