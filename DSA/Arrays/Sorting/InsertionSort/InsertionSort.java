package DSA.Arrays.Sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2, 6, 9, 20 };
        System.out.println(Arrays.toString(insertionSortIncreasing(arr)));
        System.out.println(Arrays.toString(insertionSortDecreasing(arr)));
    }

    /*
     * Insertion Sort For Sorting In Ascending Order.
     */
    static int[] insertionSortIncreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    /*
     * Insertion Sort For Sorting In Descending Order.
     */
    static int[] insertionSortDecreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }
}
/*
 * In this algorithm sorting is done by part by part.
 * 
 * Time Complexity
 * -------------------
 * Best Case = O(n).
 * Worst Case = O(n*n);
 * 
 * Space Complexity
 * -------------------
 * O(1), Constant complexity.
 * 
 */