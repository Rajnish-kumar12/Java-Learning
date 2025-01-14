/*
 * Binary Search Implementation
 */
package DSA.Arrays.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.println("Please Enter any sorted  array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Your array are : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the target element for search : ");
        int target = input.nextInt();
        int result = searchItem(arr, target);
        System.out.println("Index of the array are : " + result);
    }

    /*
     * For searching the element
     */
    static int searchItem(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            boolean checkSortedOrder = arr[0] < arr[arr.length - 1];
            if (target == arr[mid]) {
                return mid;
            }
            if (checkSortedOrder) {
                if (target > arr[mid]) {
                    startIndex = mid + 1;
                } else {
                    endIndex = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    endIndex = mid - 1;
                } else {
                    startIndex = mid + 1;
                }
            }
        }
        return -1;
    }
}