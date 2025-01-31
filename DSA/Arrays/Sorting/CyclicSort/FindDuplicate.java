/*
 * Find the Duplicate Number
 * 
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * There is only one repeated number in nums, return this repeated number.
 * You must solve the problem without modifying the array nums and using only constant extra space.
 * 
 * https://leetcode.com/problems/find-the-duplicate-number/description/
 * 
 */
package DSA.Arrays.Sorting.CyclicSort;

import java.util.Arrays;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2, 3, 4 };
        int x = cyclicSort(arr);
        System.out.println(x);
    }

    static int cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        return arr[arr.length - 1];
    }
}