/*
 * Below code is of bubble sort algorithm for sorted in increasing order.
 * worst case O(n*n)
 * best case O(n)
 */
package DSA.Arrays.Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSortAlgorithm {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
}
/*
 * Bubble sort
 * -----------------
 * -----------------
 * It is the sorting algorithm, also known as sinking sort or exchange sort.
 * 
 * Note : with the first pass through the array the largest element come to the
 * end.
 * 
 * complexity of this algorithm.
 * ------------------------------
 * Time complexity = best case O(n), where n is no of comparison
 * worst case O(n*n).
 * 
 * Space complexity = O(1), because we didn't take any extra space.
 * 
 * Note : --> for best array is sorted.
 * 
 * --> for worst case array is sorted in descending and requirement is to
 * sorting in ascending.
 * 
 * eg) arr = [3,1,5,4,2];
 * first loop
 * first = [1,3,5,4,2];
 * second = [1,3,4,5,2];
 * third = [1,2,3,2,5];
 * 
 * Now the second loop will start, and it will begin from the second element.
 * However, there is no need to check until the last element
 * because the last element will already be the maximum.
 * and goes on untill the element is not sorted.
 */