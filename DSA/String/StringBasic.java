/*
 * Basics of string
 * 
 * String is a collection of character or sequence of character
 * 
 */
package DSA.String;

import java.util.Arrays;

public class StringBasic {

    public static void main(String[] args) {
        String name = "Rajnish Kumar";
        /*
         * Here is String is a class also datatype, name is a reference variable
         * and "Rajnish kumar" is the object of string class"
         */
        System.out.println(name);
        name = "kumar"; // here name is not changed from original string here new object is created with
                        // the value kumar.
        System.out.println(name);
        int[] arr = { 1, 2, 3, 4 };
        int[] b = { 1, 2, 3, 4 };
        System.out.println(arr == b);// == (false) check that the object have same reference variable or not.
        System.out.println(arr.equals(b));// (false) both point to different reference variable, check the reference
                                          // variable is same or different

        int[] arrNew = { 1, 2, 3, 4 };
        int[] c = arrNew;
        c[1] = 5;
        System.out.println(Arrays.toString(arrNew));// here it get change in the arrNew because both point to the same
                                                    // object

        /*
         * In case if string
         * 
         * It creates the string in pool(string pool is the mmory srea inside heap which
         * stores string which is defined other than new keyword, because new keyword
         * string is stored in heap not in string pool)
         * 
         */
        String p = "Rajnish";
        String q = "Rajnish";
        // here both reference variable point to the same object in string pool.
        System.out.println(p == q); // both p and q have same reference variable name is difference but reference
                                    // variable value is same(true).
        System.out.println(p.equals(q));// check the content(true).
        // String is immutable
        q = "kumar";// it creates new object with the value kumar it doesnot change the p string.
        System.out.println(p);
        System.out.println(q);

        /*
         * Using new keyword
         * It creates the string in heap not inside pool.
         * 
         */
        String str = new String("Rajnish");
        String str1 = new String("Rajnish");
        System.out.println(str == str1); // check reference variable(false).
        System.out.println(str.equals(str1)); // check content (true).

        /*
         * Properties
         */
        String stri = "Rajnish";
        // System.out.println(stri[0]); we can't do this in string
        System.out.println(stri.charAt(0));
    }

}