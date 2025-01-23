/*
 * Ceiling number is the  smallest element which is greater than or equal to target element.
 */
public class CeilingOfNumber {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15; // ceiling is 16 and floor is 14
        System.out.println(findCeiling(arr, target));
    }

    static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[end];
    }
}