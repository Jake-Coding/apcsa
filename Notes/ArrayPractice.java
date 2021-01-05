import java.util.*;

public class ArrayPractice {

    public static void main(String[] args) {

        // ordered data
        // syntax: type[] name;
        // ways to initialize: 
            // {value1, value2, etc} (on declaration)
            // new type[] {value1, value2} (on declaration)
            // new type[size] (anytime)

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
                System.out.println(numbers[i]);
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

    public static void printArray(int[] nums) {
        System.out.println(nums); // memory address
        System.out.println(Arrays.toString(nums)); // array vals
    }

}
