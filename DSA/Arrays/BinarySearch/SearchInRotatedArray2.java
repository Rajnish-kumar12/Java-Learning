/*
 * Search in rotated array where elemnt are also may be repeated not only distinct.
 * Input: nums = [2,5,6,0,0,1,2], target = 0
 * Output: true
 * 
 * https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/?envType=problem-list-v2&envId=binary-search
 * 
 */
package DSA.Arrays.BinarySearch;

public class SearchInRotatedArray2 {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1 };
        int target = 1;
        System.out.println(checkElement(arr, target));
    }

    static boolean checkElement(int[] arr, int target) {
        int pivot = findPivot(arr);
        System.out.println("Pivot = " + pivot);
        if (pivot == -1) {
            return findTarget(arr, target, 0, arr.length - 1);
        }
        return (findTarget(arr, target, 0, pivot) != false) ? true : findTarget(arr, target, pivot + 1, arr.length - 1);
    }

    static boolean findTarget(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    // int[] arr = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1 };
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (arr[start] > arr[mid] && arr[end] > arr[mid]) {
                    return start;
                }
                start++;
                if (arr[start] < mid && arr[mid] < arr[end]) {
                    return end;
                }
                end--;
            } else {
                if (arr[start] >= arr[mid]) {
                    return start;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}