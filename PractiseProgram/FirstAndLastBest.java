import java.util.Arrays;

public class FirstAndLastBest {

    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };
        int target = 7;
        int[] result = findOccurance(arr, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] findOccurance(int[] arr, int target) {
        int first = findPosition(arr, target, true);
        int last = findPosition(arr, target, false);
        return new int[] { first, last };
    }

    static int findPosition(int[] arr, int target, boolean x) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int result = -1;
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (arr[mid] == target) {
                result = mid;
                if (x) {
                    endIndex = mid - 1;
                } else {
                    startIndex = mid + 1;
                }
            } else if (arr[mid] > target) {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }
        return result;
    }

}