/*
 * Recursion using binary search
 */
package DSA.Recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 10 };
        int target = 3;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return search(arr, target, mid + 1, e);
        }
        return search(arr, target, s, mid - 1);
    }
}