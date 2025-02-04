package DSA.String;

import java.util.ArrayList;

public class Operators {

    public static void main(String[] args) {
        System.out.println('a' + 'b');// taking unicode and sum
        System.out.println("a" + "b");// concatenate the string
        System.out.println((char) ('a' + 3));
        // when you are doing addition or any operation with character then it converts
        // into unicode but in string it taking string value.
        System.out.println("a" + 1);
        // intger will be converted to the Integer and that will call toString method
        System.out.println("Rajnish" + 34);
        /*
         * + in java , only use with primitive or use with atleast one of object with
         * type string in below it error and entire result is of string type
         */
        // System.out.println(new Integer(56)+new ArrayList<>()); error
        // System.out.println(new Integer(56)+""+new ArrayList<>()); no error because
        // here one object is string type

        /*
         * In Java, the `+` operator is overloaded for String objects.
         * It allows concatenation of multiple strings, making it an exception provided
         * by java.
         * to Java’s general rule that operator overloading is not supported.
         */

    }
}