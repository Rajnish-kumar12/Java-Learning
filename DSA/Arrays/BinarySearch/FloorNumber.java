/*
 * Given array arr and target element
 * op :: output should be the biggest number which is smaller than or equal to target number.
 * Below Code is in Olog(n) complexity.
 */
package DSA.Arrays.BinarySearch;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 10;
        System.out.println("Floor value for the " + target + " is : " + floorNumber(arr, target));
    }

    static int floorNumber(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        if (target < arr[0]) {
            return -1;
        }
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            } else if (target > arr[mid]) {
                startIndex = mid + 1;
            } else {
                endIndex = mid - 1;
            }
        }
        return arr[endIndex];
    }
}
