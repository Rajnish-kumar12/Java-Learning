/*
 * Cyclic sort
 */
package DSA.Arrays.Sorting.CyclicSort;

import java.util.Arrays;

public class CyclicSort1 {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2 };
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*
     * Sort array in descending order
     */
    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr.length - arr[i];
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }
}