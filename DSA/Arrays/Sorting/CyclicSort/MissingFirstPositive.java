/*
 * Find missing number in given array.
 * Given an array nums containing n distinct numbers in the range [0, n], 
 * return the only number in the range that is missing from the array.
 * 
 * https://leetcode.com/problems/first-missing-positive/description/?envType=problem-list-v2&envId=array
 * 
 */
package DSA.Arrays.Sorting.CyclicSort;

import java.util.Arrays;

public class MissingFirstPositive {

    public static void main(String[] args) {
        int[] arr = { 1, 7, 8, 9, 11, 12 };
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("First Missing Positive Number is  : " + cyclicSort(arr));
    }

    static int cyclicSort(int[] arr) {
        int i = 0;
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
                return index + 1;
            }
        }
        return arr.length + 1;
    }
}