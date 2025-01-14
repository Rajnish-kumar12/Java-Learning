/*
 * Search in the array and return the index if item found otherwise if item not found return -1.
 * DO using function.
 */
package DSA.Arrays.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("resource")
public class LinearSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Your array are : " + Arrays.toString(arr));
        System.out.println("Now Enter the element to be search from the above array");
        int searchElement = input.nextInt();
        int result = searchElement(arr, searchElement);
        System.out.println("Your element is at index : " + result);

    }

    static int searchElement(int[] nums, int element) {
        if (nums.length == 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                return i;
            }
        }
        return -1;
    }
}