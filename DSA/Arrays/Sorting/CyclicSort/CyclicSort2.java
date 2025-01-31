/*
 * Cyclic Sort array Start From 0
 */
package DSA.Arrays.Sorting.CyclicSort;

import java.util.Arrays;

public class CyclicSort2 {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 0, 2 };
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
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