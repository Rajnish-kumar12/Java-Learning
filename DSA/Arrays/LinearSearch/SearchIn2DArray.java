/*
 * Searching in 2d array
 */
package DSA.Arrays.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
        System.out.println("Your 2d array are below : ");
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        System.out.println("Enter your target element : ");
        int targetElement = input.nextInt();
        boolean result = searchElement(arr, targetElement);
        if (result) {
            System.out.println("Element found");
            System.out.println("Index of the element are : ");
            int[] index = searchElementIndex(arr, targetElement);
            System.out.println(Arrays.toString(index));
        } else {
            System.out.println("Element not found");
        }

    }

    /*
     * This method for the check value and return true or false, that value is
     * present or not.
     */
    static boolean searchElement(int[][] arr, int target) {
        for (int[] is : arr) {
            for (int data : is) {
                if (data == target) {
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * This method for the index return
     */
    static int[] searchElementIndex(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                } // created new array for i and j and set the i and j in the array and return;
            }
        }
        return new int[] { -1, -1 };
    }
}
/*
 * learning
 * -----------
 * The Arrays.toString() method is designed for one-dimensional arrays and does
 * not correctly format a 2D array.
 */
