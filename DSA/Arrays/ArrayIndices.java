package DSA.Arrays;

public class ArrayIndices {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr1 = new int[5];
        String[] arr2 = new String[4];
        System.out.println(arr[0]);
        System.out.println(arr[3]);
        System.out.println(arr1[2]);
        System.out.println(arr1[0]);
        System.out.println(arr2[3]);
    }
}
/*
 * Default value of integer array elements is 0 if no value is assigned to the
 * array.
 * Default value of string array elements is null if no value is assigned to the
 * array.
 * null can't be assigned to the premitives data types.
 * any reference variable which is not defined then the default value is null.
 * null is not a data-type.
 */

// Note :: In java all primitives stored in stack but all objects are stored in heap