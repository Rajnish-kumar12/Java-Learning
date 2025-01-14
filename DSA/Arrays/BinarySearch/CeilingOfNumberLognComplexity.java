/*
 * Given array arr and target element
 * op :: output should be the smallest number which is greater than or equalto the target.
 * DO code in Olog(n) complexity.
 */
package DSA.Arrays.BinarySearch;

public class CeilingOfNumberLognComplexity {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 10;
        System.out.println(findCeiling(arr, target));
    }

    static int findCeiling(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                startIndex = mid + 1;
            } else {
                endIndex = mid - 1;
            }
        }
        return arr[startIndex];
    }
}
