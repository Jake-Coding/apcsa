import java.util.*;
public class Search {
    public static void main(String[] args) {
        String[] fruits = {"apple", "cherry", "banana", "elderberry", "date"};
        // System.out.println(indexOf("cherry", fruits));
        // System.out.println(indexOf("notInList", fruits));

        Arrays.sort(fruits);

        System.out.println(binIndexOf("cherry", fruits));
        System.out.println(binIndexOf("notInList", fruits));
        List<String> a = new ArrayList<String>(Arrays.asList(new String[]{"a", "b", "d"}));
        List<String> b = new ArrayList<String>(Arrays.asList(new String[]{"a","c","e"}));
        System.out.println(merge(a, b));

    }

    public static int indexOf(String needle, String[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i].equals(needle)) return i;
        }
        return -1;
    }

    public static int binIndexOf(String needle, String[] haystack) {
        int lowerbound, upperbound;
        lowerbound = 0;
        upperbound = haystack.length-1;
        return binIndexOf(needle, haystack, lowerbound, upperbound);
    }

    private static int binIndexOf(String needle, String[] haystack, int lowerbound, int upperbound) {
        int pivot = (upperbound-lowerbound) / 2;
        if (lowerbound >= upperbound) return -1;

        int comp_result = haystack[pivot].compareTo(needle);
        if (comp_result == 0) return pivot;
        if (comp_result > 0) {
            return binIndexOf(needle, haystack, pivot, upperbound);
        }
        return binIndexOf(needle, haystack, lowerbound, pivot);
    }

    public static ArrayList<String> merge(List<String> a, List<String> b) {
        int a_pointer, b_pointer;
        a_pointer = 0;
        b_pointer = 0;
        ArrayList<String> merged = new ArrayList<String>(a.size() + b.size());
        while (a_pointer < a.size() && b_pointer < b.size()) {
            int comp_result = a.get(a_pointer).compareTo(b.get(b_pointer));
            if (comp_result == 1) {
                merged.add(a.get(a_pointer));
                a_pointer++;
            } else {
                merged.add(b.get(b_pointer));
                b_pointer++;
            }
        }
        while (a_pointer < a.size()) {
            merged.add(a.get(a_pointer));
            a_pointer++;
        }
        while (b_pointer < b.size()) {
            merged.add(b.get(b_pointer));
            b_pointer++;
        }
        return merged;
    }
}