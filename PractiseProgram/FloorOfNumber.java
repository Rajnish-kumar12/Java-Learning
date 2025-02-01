/*
 * Find floor of a number in an array
 * 
 * Floor of a number is a number which is biggest number that is smaller than or
 * equal to the target number.
 * 
 */
public class FloorOfNumber {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 10, 15, 18, 20 };
        int target = 12;
        System.out.println(findFloorNumber(arr, target));
    }

    static int findFloorNumber(int[] arr, int target) {
        if (target < arr[0]) {
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
        return arr[end];
    }
}