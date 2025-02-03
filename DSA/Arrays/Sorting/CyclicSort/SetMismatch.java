/*
 * Find set mismatch
 * 
 * https://leetcode.com/problems/set-mismatch/submissions/1529424771/?envType=
 * problem-list-v2&envId=array
 * 
 * You have a set of integers s, which originally contains all the numbers from
 * 1 to n. Unfortunately, due to some error, one of the numbers in s got
 * duplicated to another number in the set, which results in repetition of one
 * number and loss of another number.
 * You are given an integer array nums representing the data status of this set
 * after the error.
 * Find the number that occurs twice and the number that is missing and return
 * them in the form of an array.
 */
package DSA.Arrays.Sorting.CyclicSort;

import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {
        int[] arr = { 1, 1 };
        System.out.println(Arrays.toString(findSetMismatch(arr)));
    }

    static int[] findSetMismatch(int[] arr) {
        int i = 0;
        int duplicate = 0;
        int loss = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                loss = j + 1;
                duplicate = arr[j];
            }
        }
        return new int[] { duplicate, loss };
    }
}