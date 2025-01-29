
/*
 * https://leetcode.com/problems/missing-number/description/?envType=problem-list-v2&envId=sorting
 */
import java.util.Arrays;

public class FindMissingNumberCycle {

    public static void main(String[] args) {
        int[] arr = { 0, 1 };
        int missing = findMissing(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(missing);
    }

    static int findMissing(int[] arr) {
        int i = 0;
        int missingNumber = arr.length;
        while (i < arr.length) {
            int validIndex = arr[i];
            if (arr[i] >= 0 && arr[i] < arr.length && arr[i] != arr[validIndex]) {
                int temp = arr[i];
                arr[i] = arr[validIndex];
                arr[validIndex] = temp;

            } else {
                i++;
            }

        }
        for (int missing = 0; missing < arr.length; missing++) {
            if (arr[missing] != missing) {
                missingNumber = missing;
            }
        }
        return missingNumber;
    }
}