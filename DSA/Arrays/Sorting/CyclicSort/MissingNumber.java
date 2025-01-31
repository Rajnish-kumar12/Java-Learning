/*
 * Find missing number in given array.
 * Given an array nums containing n distinct numbers in the range [0, n], 
 * return the only number in the range that is missing from the array.
 * 
 * https://leetcode.com/problems/missing-number/description/?envType=problem-list-v2&envId=sorting
 * 
 */
package DSA.Arrays.Sorting.CyclicSort;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0 };
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Missing Number in above array is : " + cyclicSort(arr));
    }

    static int cyclicSort(int[] arr) {
        int i = 0;
        int missingNumber = arr.length;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                missingNumber = index + 1;
            }
        }
        return missingNumber;
    }
}