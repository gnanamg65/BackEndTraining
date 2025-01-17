package Day13.ArraySort;

import java.util.Arrays;

public class ArraySorter {

    public int[] sortArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        Arrays.sort(arr);
        return arr;
    }
}
