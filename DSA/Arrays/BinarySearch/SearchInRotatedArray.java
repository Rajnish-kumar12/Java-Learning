/*
 * Search in Rotated Sorted Array
 * Input: nums = [4,5,6,7,0,1,2], target = 0 array is rotated from index 3
 * Output: 4
 * 
 * https://leetcode.com/problems/search-in-rotated-sorted-array/description/?envType=problem-list-v2&envId=binary-search
 * 
 */
package DSA.Arrays.BinarySearch;

public class SearchInRotatedArray {

    public static void main(String[] args) {
        // int[] arr = { 0, 1, 2, 4, 5, 6, 7 };
        int[] arr = { 3, 1 };
        // int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 1;
        System.out.println(findTarget(arr, target));
    }

    /*
     * Find the target and return to the main function
     */
    static int findTarget(int[] arr, int target) {
        int pivot = findPivot(arr);
        System.out.println("pivot = " + pivot);
        if (pivot == -1) {
            return search(arr, target, 0, arr.length - 1);
        }
        // int first = search(arr, target, 0, pivot);
        // int second = search(arr, target, pivot, arr.length - 1);
        int element = (search(arr, target, 0, pivot) != -1) ? search(arr, target, 0, pivot)
                : search(arr, target, pivot + 1, arr.length - 1);
        return element;
        // return (first != -1) ? first : second;

    }

    static int search(int[] arr, int target, int startIndex, int endIndex) {
        System.out.println("start = " + startIndex);
        System.out.println("end = " + endIndex);
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

    /*
     * Function to return the pivot element
     */
    static int findPivot(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (mid < endIndex && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > startIndex && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[startIndex] >= arr[mid]) {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }
        return -1;
    }
}
/*
 * In this code first try to find the pivot index:
 * 1) If function return not pivot it means array is not rotated then do simple
 * binary search and find the target.
 * 2) If function return pivot then search the target in both half before pivot
 * and after pivot using binary search.
 */