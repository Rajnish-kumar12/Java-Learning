/*
 * You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
 * Return the index of the peak element.
 * 
 * Below code is in O(n) complexity for O(logn) solution you can check in Arrays->BinarySearch folder.
 */
public class PeakIndex {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 4, 3, 2 };
        System.out.println("The peak element index are : " + findPeak(arr));
    }

    static int findPeak(int[] arr) {
        int maxPosition = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxPosition]) {
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}