/*
 * https://leetcode.com/problems/split-array-largest-sum/description/?envType=problem-list-v2&envId=binary-search
 */
package DSA.Arrays.BinarySearch;

public class SplitArrayLargetSum {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 }; // op = 9
        int k = 2; // means non-empty subarray should be 2
        System.out.println(sum(arr, k));
    }

    static int sum(int[] arr, int k) {
        if (arr.length < 2) {
            return -1;
        }
        int minOfMax = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int first = findSum(arr, 0, i); // Sum of the first subarray
            int second = findSum(arr, i + 1, arr.length - 1); // Sum of the second subarray
            int max;

            if (first > second) {
                max = first;
            } else {
                max = second;
            }
            if (max < minOfMax) {
                minOfMax = max;
            }
        }
        System.out.println("min of max" + minOfMax);
        return minOfMax;
    }

    /*
     * Find sum of sub array.
     */
    static int findSum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    /*
     * Find Max of two sub-array.
     */
    static int findMax(int first, int second) {
        return first > second ? first : second;
    }
}
/*
 * subarray == A subarray must be a contiguous part of the original array,
 * meaning all elements in
 * the subarray must be in the same order as they appear in the original array.
 * You cannot rearrange elements.
 */
/*
 * Above code is only work for k = 2 so have to do in another way.
 */