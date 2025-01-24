package DSA.Arrays.BinarySearch;

public class FindPivotInSortedArray {

    public static void main(String[] args) {
        int[] arr = { 6, 7, 8, 0, 1, 2, 4, 5 };
        int pivotElement = findPivot(arr);
        System.out.println(pivotElement);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[start] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}