package DSA.Arrays.MultiDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class ToStringMultiDimensional {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        input.close();
    }
}
/*
 * Note :: In toString method pass the array reference in which array elements
 * are stored, it print the the elements in the form of array.
 */