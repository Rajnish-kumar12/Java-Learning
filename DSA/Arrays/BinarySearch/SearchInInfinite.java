/*
 * Find position of element in sorted array of infinite numbers.
 */
package DSA.Arrays.BinarySearch;

public class SearchInInfinite {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 7;
        System.out.println(findElementFromInfiniteArray(arr, target));
    }

    static int findElementFromInfiniteArray(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = 1;
        while (target > arr[endIndex]) {
            int temp = endIndex + 1;
            endIndex = endIndex + (endIndex - startIndex + 1) * 2;
            startIndex = temp;
        }
        return BinarySearchs(arr, target, startIndex, endIndex);
    }

    static int BinarySearchs(int[] arr, int target, int startIndex, int endIndex) {
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (target < arr[mid]) {
                endIndex = mid - 1;
            } else if (target > arr[mid]) {
                startIndex = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}