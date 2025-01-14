package DSA.Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class InputOuptput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Array of primitives
         */
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Your array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        input.close(); // close the scanner to avoid leak

        /*
         * Below is the enhanched for loop
         */
        for (int num : arr) { // for every element in array, print the element.
            System.out.println(num); // num represent element of the array.
        }

        /*
         * one another way to print the array in array format.
         */
        System.out.println(Arrays.toString(arr));

        /*
         * Array of objects.
         */
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println("your string array elements are:");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        /*
         * using short for loop method
         */
        for (String val : str) {
            System.out.println(val);
        }
        /*
         * Shortcut way
         */
        System.out.println(Arrays.toString(str));
    }
}