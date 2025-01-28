public class SplitArraylargestSum {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int k = 5;
        System.out.println("The Minimum of maximum are : " + findMinMax(arr, k));
    }

    static int findMinMax(int[] arr, int k) {
        int start = findStart(arr);
        int end = findEnd(arr);
        int ans = arr[0];
        while (start <= end) {
            int mid = (start + end) / 2;
            int splitArray = splitArray(arr, mid);
            if (splitArray > k) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    /*
     * splitt array in k parts with the maximum value takes less than or equal to
     * mid.
     */
    static int splitArray(int[] arr, int mid) {
        int sum = 0;
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + sum > mid) {
                sum = arr[i];
                count++;
            } else {
                sum = sum + arr[i];
            }
        }
        return count;
    }

    /*
     * Find start value of range that should be the answer.
     */
    static int findStart(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /*
     * Find end value of the range that should be the answer.
     */
    static int findEnd(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}