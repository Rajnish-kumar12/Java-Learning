/*
 * Two Sum II - Input Array Is Sorted
 * 
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description
 * 
 */

import java.util.Arrays;

public class TwoSum2 {

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(findTwoSumElementIndex(arr, target)));
    }

    static int[] findTwoSumElementIndex(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == target) {
                return new int[] { left + 1, right + 1 };
            } else if (arr[left] + arr[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] { 0, 0 };
    }
}