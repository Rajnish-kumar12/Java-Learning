package DSA.Arrays.BinarySearch;

public class FindPivotInSortedArray {

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 1, 2 };
        int pivotElement = findPivot(arr);
        System.out.println(pivotElement);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        if (arr.length < 2) {
            return arr[0];
        }

        if (arr[0] < arr[arr.length - 1]) {
            return arr[0];
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid;
            } else if (arr[start] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}