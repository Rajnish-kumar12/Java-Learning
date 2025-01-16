/*
 * Peak Index in Moumtain array 
 * 
 * You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
 * Return the index of the peak element.
 * Your task is to solve it in O(log(n)) time complexity.
 * 
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/description/?envType=problem-list-v2&envId=binary-search
 * 
 */
package DSA.Arrays.BinarySearch;

public class PeakIndex {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0 };
        System.out.println("The peak element index are : " + findPeak(arr));
    }

    static int findPeak(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex < endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (arr[mid] > arr[mid + 1]) {
                endIndex = mid;
            } else {
                startIndex = mid + 1;
            }

        }
        return startIndex;
    }
}
/*
 * Mountain Array
 * ------------------
 * Conditions for a Mountain Array:
 * There must be at least one peak element (an element greater than its
 * neighbors).
 * The elements must strictly increase up to the peak.
 * The elements must strictly decrease after the peak.
 * No flat regions are allowed (i.e., no two consecutive elements should be
 * equal).
 */