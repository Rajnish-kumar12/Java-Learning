
/*
 * strictly sorted matrix
 * 
 * 1    2   3   4
 * 5    6   7   8
 * 9   10  11  12
 * 13  14  15  16
 * 17  18  19  20
 * 
 * 
 * Below code is in the complexity of O(logm+logn)
 * 
 */
import java.util.Arrays;

public class SearchInRotatedMatrix {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
        int target = 1;
        System.out.println(Arrays.toString(findElement(arr, target)));
    }

    static int[] findElement(int[][] arr, int target) {
        int rows = arr.length; // give the number of rows
        int cols = arr[0].length; // gives the number of column
        if (rows == 0) {
            return new int[] { -1, -1 };
        }
        if (rows == 1) {
            return binarySearchForRow(arr, rows, 0, cols - 1, target);
        }
        int colMid = cols / 2;
        int rowStart = 0;
        int rowEnd = rows - 1;
        while (rowStart < (rowEnd - 1)) {
            int mid = (rowStart + rowEnd) / 2;
            if (arr[mid][colMid] == target) {
                return new int[] { mid, colMid };
            } else if (arr[mid][colMid] < target) {
                rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }

        // check for column
        if (arr[rowStart][colMid] == target) {
            return new int[] { rowStart, colMid };
        }
        if (arr[rowStart + 1][colMid] == target) {
            return new int[] { rowStart + 1, colMid };
        }

        // check for sorted array
        if (arr[rowStart][colMid - 1] >= target) {
            return binarySearchForRow(arr, rowStart, 0, colMid - 1, target);
        }
        if (arr[rowStart][colMid + 1] <= target && target <= arr[rowStart][cols - 1]) {
            return binarySearchForRow(arr, rowStart, colMid + 1, cols - 1, target);
        }
        if (arr[rowStart + 1][colMid - 1] >= target) {
            return binarySearchForRow(arr, rowStart + 1, 0, colMid - 1, target);
        } else {
            return binarySearchForRow(arr, rowStart + 1, colMid + 1, cols - 1, target);
        }

    }

    static int[] binarySearchForRow(int[][] arr, int row, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[row][mid] == target) {
                return new int[] { row, mid };
            } else if (arr[row][mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }
}