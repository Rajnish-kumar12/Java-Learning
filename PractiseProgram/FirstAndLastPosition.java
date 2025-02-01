
/*
 * Find first and last position of element in java.
 * 
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 * 
 */

import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 8, 10 };
        int target = 8;
        System.out.println(Arrays.toString(findFirstAndLastPosition(arr, target)));
    }

    static int[] findFirstAndLastPosition(int[] arr, int target) {
        int firstPosition = -1;
        int lastPosition = -1;
        firstPosition = findFirstPosition(arr, target);
        lastPosition = findLastPosition(arr, target);
        return new int[] { firstPosition, lastPosition };
    }

    static int findFirstPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int first = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return first;
    }

    static int findLastPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int last = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last;
    }

}
/*
 * We can optimize this code in single binary search also above code is for
 * understanding purpose.
 */