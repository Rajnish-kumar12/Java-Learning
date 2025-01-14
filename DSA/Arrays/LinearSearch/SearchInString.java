package DSA.Arrays.LinearSearch;

import java.util.Scanner;
import java.util.Arrays;

public class SearchInString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println("Your Students are : " + Arrays.toString(str));
        System.out.println("Enter the student name to be search");
        String studentName = input.next();
        String result = searchStudent(str, studentName);
        System.out.println(result);

    }

    static String searchStudent(String[] students, String name) {
        for (String checkName : students) {
            if (checkName.equals(name)) {
                return checkName;
            }
        }
        return "Not Found";
    }
}