/*
 * Here we taking minimum element in every round and adjust thier actual position, selection sort algorithm and sort in increasing order.
 */
package DSA.Arrays.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort2 {

    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3 };
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
        arr[min] = arr[round];
        arr[round] = temp;
        System.out.println("Array" + Arrays.toString(arr));
    }

    static int findMin(int[] arr, int startIndex) {
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}