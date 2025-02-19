/*
 * Cyclic sort
 */
package DSA.Arrays.Sorting.CyclicSort;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2 };
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*
     * Sorted In Increasing Order
     */
    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int validIndex = arr[i] - 1;
            if (arr[i] != arr[validIndex]) {
                int temp = arr[i];
                arr[i] = arr[validIndex];
                arr[validIndex] = temp;
            } else {
                i++;
            }
        }
    }
}
/*
 * cyclic sort is applicable only in where element of unsorted array are between
 * 1 to n or 0 to n or continuous array.
 */