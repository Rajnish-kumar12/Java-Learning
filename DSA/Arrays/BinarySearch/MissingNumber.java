/*
 * Missing Number
 * Given an array nums containing n distinct numbers in the range [0, n], 
 * return the only number in the range that is missing from the array.
 * Mathematical Approach.
 */
package DSA.Arrays.BinarySearch;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        int missingNumber = missingNumber(arr);
        System.out.println(missingNumber);
    }

    static int missingNumber(int[] arr) {
        int n = arr.length;
        int sum = (n * (n + 1)) / 2;
        int sumArr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArr = sumArr + arr[i];
        }
        return sum - sumArr;
    }

}