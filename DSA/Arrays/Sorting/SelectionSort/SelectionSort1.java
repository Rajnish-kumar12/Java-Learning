/*
 * Sort in decreasing order using selection sort.
 */
package DSA.Arrays.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort1 {

    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3, 6, 0 };
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int[] selectionSort(int[] arr) {
        for (int round = 0; round < arr.length; round++) {
            int max = findMax(arr, round);
            swapping(arr, round, max);
        }
        return arr;
    }

    static void swapping(int[] arr, int round, int maxIndex) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[arr.length - round - 1];
        arr[arr.length - round - 1] = temp;
    }

    static int findMax(int[] arr, int round) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length - round; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}