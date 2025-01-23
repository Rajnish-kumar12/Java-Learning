/*
 * Below code is of bubble sort algorithm for sorted in decreasing order.
 * worst case O(n*n)
 * best case O(n)
 */
package DSA.Arrays.Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSortAlgorithm1 {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}