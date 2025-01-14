package DSA.Arrays;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 12 };
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 100;
    }

}
/*
 * Note :: In above code arr and nums points to the same object
 */