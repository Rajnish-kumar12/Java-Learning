package DSA.Arrays.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchMinimum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Please input the element of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }
        System.out.println("your array are : " + Arrays.toString(arr));
        int result = minElement(arr);
        System.out.println("Minimum element of the array are : "+result);
    }

    static int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }
}