import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 10 };
        int target = 7;
        System.out.println(Arrays.toString(findFirstAndLast(arr, target)));
    }

    static int[] findFirstAndLast(int[] arr, int target) {
        int first = findIndex(arr, target, true);
        int last = findIndex(arr, target, false);
        return new int[] { first, last };
    }

    static int findIndex(int[] arr, int target, boolean flag) {
        int result = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                if (flag) {
                    end = mid - 1;
                    result = mid;
                } else {
                    start = mid + 1;
                    result = mid;
                }
            }
        }
        return result;
    }
}