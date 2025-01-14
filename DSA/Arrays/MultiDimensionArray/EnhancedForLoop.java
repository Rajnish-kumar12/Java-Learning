package DSA.Arrays.MultiDimensionArray;

import java.util.Scanner;
// import java.util.Arrays;

public class EnhancedForLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col);
            }
            System.out.println();
            // System.out.println(Arrays.toString(row)); this is directly print the array
            // with the elements
        }
        input.close();
    }
}

/*
 * Enhanced for loop is mainly use to iterate over the existing array, not for
 * the taking input.
 */