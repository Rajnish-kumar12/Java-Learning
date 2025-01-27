/*
 * strictly sorted matrix
 * 
 * 1   2   3   4
 * 5   6   7   8
 * 9  10  11  12
 * 13 14  15  16
 * 
 * 
 * Below code is in the complexity of O(logm+logn)
 * 
 * https://leetcode.com/problems/search-a-2d-matrix/?envType=problem-list-v2&envId=binary-search
 * 
 */
package DSA.Arrays.BinarySearch.TwoD;

import java.util.Arrays;

public class SearchInSortedMatrix {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
        };
        int target = 7;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target) {
        int rows = arr.length; // number of rows
        int col = arr[0].length; // number of coumn
        if (rows == 0) {
            return new int[] { -1, -1 };
        }
        if (rows == 1) {
            return simpleBinarySearch(arr, 0, 0, col - 1, target);
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int cMid = col / 2;

        // run the loop till tow rows are remaining
        while (rowStart < (rowEnd - 1)) {
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (arr[mid][cMid] == target) {
                return new int[] { mid, cMid };
            } else if (arr[mid][cMid] < target) {
                rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }

        if (arr[rowStart][cMid] == target) {
            return new int[] { rowStart, cMid };
        }
        if (arr[rowStart + 1][cMid] == target) {
            return new int[] { rowStart + 1, cMid };
        }
        if (cMid - 1 >= 0 &&target <= arr[rowStart][cMid - 1]) {
            return simpleBinarySearch(arr, rowStart, 0, cMid - 1, target);
        }
        if (cMid + 1 < col &&target >= arr[rowStart][cMid + 1] && target <= arr[rowStart][col - 1]) {
            return simpleBinarySearch(arr, rowStart, cMid + 1, col - 1, target);
        }   
        if (cMid - 1 >= 0&&target <= arr[rowStart + 1][cMid - 1]) {
            return simpleBinarySearch(arr, rowStart + 1, 0, cMid - 1, target);
        } else if(cMid + 1 < col) {
            return simpleBinarySearch(arr, rowStart + 1, cMid + 1, col - 1, target);
        }
        return new int[]{-1,-1};
    }

    /*
     * Search in row provided between col provided.
     */
    static int[] simpleBinarySearch(int[][] arr, int rows, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (arr[rows][mid] == target) {
                return new int[] { rows, mid };
            } else if (arr[rows][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }
}