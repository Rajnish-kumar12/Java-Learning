package DSA.String;

import java.util.Arrays;

public class StringMethod {

    public static void main(String[] args) {
        String name = "Rajnish kumar";
        System.out.println(Arrays.toString(name.toCharArray())); // convert to the character array
        System.out.println(name.length());
        System.out.println(name.toLowerCase());// it doesnot change original one it create new object because string is
                                               // immutable in java
        System.out.println(name.indexOf('R'));
        String name1 = "   Rajnish   ";
        System.out.println(name1.strip()); // remove start and end space from the string
        String student = "Rajnish manish rahul aman";
        System.out.println(Arrays.toString(student.split(" ")));
    }
}