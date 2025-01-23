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

    static int findMinMax(int[] arr, int k) {
        int start = findStart(arr);
        int end = findEnd(arr);
        System.out.println(start);
        System.out.println(end);
        while (start <= end) {
            int mid = (start + end) / 2;
        }
        return 1;
    }

    /*
     * Give the start range for the minMax
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
     * Give the end range for the minMax
     */
    static int findEnd(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}