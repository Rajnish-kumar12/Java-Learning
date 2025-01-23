/*
 * Below code is of sorting the array using selection sort algorithm in ascending order by taking maximum value.
 */
package DSA.Arrays.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 5, 6, 7 };
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int[] selectionSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            int maxIndex = 0;
            for (int i = 1; i < arr.length - j; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[arr.length - j - 1];
            arr[arr.length - j - 1] = temp;
        }
        return arr;
    }
}

/*
 * Time complexity is : worst case O(n*n)
 * Best case O(n)
 */