/*
 * https://leetcode.com/problems/split-array-largest-sum/description/?envType=problem-list-v2&envId=binary-search
 */
package DSA.Arrays.BinarySearch;

public class SplitArrayLargetSum2 {

    public static void main(String[] args) {
        int[] arr = { 7, 2, 5, 10, 8 }; // op = 9
        int k = 2;// Splitting of array in two parts
        System.out.println(findMinMax(arr, k));
    }

    /*
     * Find the minMax.
     */
    static int findMinMax(int[] arr, int k) {
        int start = findStart(arr);
        int end = findEnd(arr);
        int ans = start;
        while (start <= end) {
            int mid = (start + end) / 2;
            int part = splitArrayKTimes(arr, mid);
            if (part > k) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    /*
     * Function to split the array in k times
     */
    static int splitArrayKTimes(int[] arr, int mid) {
        int sum = 0;
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > mid) {
                sum = arr[i];
                count++;
            } else {
                sum = sum + arr[i];
            }
        }
        return count;
    }

    /*
     * Give the start range for the ans(minMax)
     */
    static int findStart(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /*
     * Give the end range for the ans(minMax)
     */
    static int findEnd(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}