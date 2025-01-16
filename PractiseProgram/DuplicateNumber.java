/*
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * There is only one repeated number in nums, return this repeated number.
 * You must solve the problem without modifying the array nums and using only constant extra space.
 * 
 * https://leetcode.com/problems/find-the-duplicate-number/description/?envType=problem-list-v2&envId=binary-search
 * 
 */
public class DuplicateNumber {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr) {
        int result = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            result = checkElement(arr, arr[i]);
        }
        return result;
    }

    static int checkElement(int[] arr, int i) {
        int startIndex = i + 1;
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (i > arr[mid]) {
                startIndex = mid + 1;
            } else if (i < arr[mid]) {
                endIndex = mid - 1;
            } else {
                return i;
            }
        }
        return -1;
    }
}