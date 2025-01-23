/*
 * sort the given array in decreasing order while using minimum element, using selection sort.
 */
package DSA.Arrays.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort3 {

    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 1, 1, 1, 1, 1, 3, 2, 4, 4, 4, 4, 4, 3 };
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int[] selectionSort(int[] arr) {
        for (int round = 0; round < arr.length; round++) {
            int min = findMin(arr, round);
            swap(arr, min, round);
        }
        return arr;
    }

    static void swap(int[] arr, int min, int round) {
        int temp = arr[min];
        arr[min] = arr[arr.length - round - 1];
        arr[arr.length - round - 1] = temp;
    }

    static int findMin(int[] arr, int round) {
        int minIndex = 0;
        for (int i = 1; i < arr.length - round; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}