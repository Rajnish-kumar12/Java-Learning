package DSA.Functions;

import java.util.Arrays;

public class ChangeValue {

    public static void main(String[] args) {
        // create an array
        int[] arr = { 1, 3, 2, 45, 6 };
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99; // modify same object, what ever we change here in the nums array it reflect in the original object.
    }
}

/*
 * Notes :: In Java, all objects are effectively passed by reference. However, technically, 
 *          Java doesn't pass the actual reference itself; instead, it passes the value of the reference (a pointer to the object). 
 *          As a result,both variables point to the same object in memory, 
 *          allowing changes made through one reference to be reflected in the other.
 */