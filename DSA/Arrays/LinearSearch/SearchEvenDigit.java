/*
 * Given an array of integers, return how many of them contain an even number of digits.
 */
package DSA.Arrays.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchEvenDigit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Your array are below : ");
        System.out.println(Arrays.toString(arr));
        int countOfEvenDigit = countEvenDigit(arr);
        System.out.println("The count of the even digit are : " + countOfEvenDigit);
    }

    /*
     * check the count the number of digit is even or not.
     */
    static int countEvenDigit(int[] arr) {
        int actualCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = checkCount(arr[i]);
            if (count % 2 == 0) {
                actualCount++;
            }
        }
        return actualCount;
    }

    /*
     * function to count the number of digits this value return in the
     * countEvenDigit methods.
     */
    static int checkCount(int digit) {
        if (digit < 0) {
            digit = digit * -1;
        }
        int count = 0;
        if (digit == 0) {
            count++;
        }
        while (digit > 0) {
            digit = digit / 10;
            count++;
        }
        return count;
    }
}