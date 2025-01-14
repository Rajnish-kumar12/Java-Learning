package DSA.Arrays;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] arr = { 6, 2, 4, 5, 9 };
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

/*
 * Above method is known as two pointer method.
 */