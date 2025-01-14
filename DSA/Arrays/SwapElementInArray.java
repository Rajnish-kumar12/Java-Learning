/*
 * Swap to elements with their indices in java
 */
package DSA.Arrays;

import java.util.Arrays;

public class SwapElementInArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Before Swapping : " + Arrays.toString(arr));
        swap(arr, 1, 3);
        System.out.println("After Swapping : " + Arrays.toString(arr));
    }

    static void swap(int[] num, int index1, int index2) {
        int temp = num[index1];
        num[index1] = num[index2];
        num[index2] = temp;
    }
}