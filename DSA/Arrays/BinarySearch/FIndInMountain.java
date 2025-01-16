/*
 * Find in mountain array
 * return minimum index of the target which is present in the array other wise return -1;
 * 
 * https://leetcode.com/problems/find-in-mountain-array/description/?envType=problem-list-v2&envId=binary-search
 * 
 */
package DSA.Arrays.BinarySearch;

public class FIndInMountain {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 3, 4, 5, 7, 9, 3, 1, 0 };
        int target = 1;
        System.out.println(findMinimumIndex(arr, target));
    }

    static int findMinimumIndex(int[] arr, int target) {
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
        int first = checkIncreasingArray(arr, target, startIndex);
        int second = checkDecreasingArray(arr, target, startIndex);
        return (first >= second) ? second : first;
    }

    static int checkIncreasingArray(int[] arr, int target, int endIndex) {
        int startIndex = 0;
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (target > arr[mid]) {
                startIndex = mid + 1;
            } else if (target < arr[mid]) {
                endIndex = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int checkDecreasingArray(int[] arr, int target, int startIndex) {
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (target > arr[mid]) {
                endIndex = mid - 1;
            } else if (target < arr[mid]) {
                startIndex = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
/*
 * Mountain Array
 * ------------------
 * Conditions for a Mountain Array:
 * 1) There must be at least one peak element (an element greater than its
 * neighbors).
 * 2) The elements must strictly increase up to the peak.
 * 3) The elements must strictly decrease after the peak.
 * No flat regions are allowed (i.e., no two consecutive elements should be
 * equal).
 */
/*
 * Above question can be done by using order agnostics binary search also which
 * reduce the code length.
 * 
 */