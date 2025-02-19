/*
 * Find ceiling of a number in array.
 * 
 * The ceiling of a number is the smallest number that is greater than or equal to the target element.
 * 
 */

public class CeilingOfNumber {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 10, 15, 18, 20 };
        int target = 4;
        System.out.println(findCellingNumber(arr, target));
    }

    static int findCellingNumber(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
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
        return arr[start];
    }
}