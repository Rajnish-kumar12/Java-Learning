/*
 * Given array = [18,12,-7,3,14,28]
 * Now search for 3 in the range of index 1 to 4.
 */
package DSA.Arrays.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Please input the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("please input the target elements");
        int target = input.nextInt();
        System.out.println("please input the start index");
        int startIndex = input.nextInt();
        System.out.println("Please input the end index");
        int endIndex = input.nextInt();
        System.out.println("Your array are : " + Arrays.toString(arr));
        boolean b = searchElement(arr, target, startIndex, endIndex);
        System.out.println(b);
    }

    static boolean searchElement(int[] arr, int target, int startIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}