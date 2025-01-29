/*
 * Cyclic sort
 */
package DSA.Arrays.Sorting.CyclicSort;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = { 1, 6, 2, 5, 4 };
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] >= 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] != x + 1) {
                System.out.println(x + 1);
            }
        }
    }

}
/*
 * cyclic sort is applicable only in where element of unsorted array are between
 * 1 to n or 0 to n or continuous array.
 */