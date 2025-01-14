package DSA.Arrays.LinearSearch;

import java.util.Arrays;

public class SearchCharacterInString {

    public static void main(String[] args) {
        String str = "Rajnish";
        char target = 'j';
        boolean b = searchCharacter(str, target);
        System.out.println(b);
        boolean bo = convertStrToCharArray(str, target);
        System.out.println(bo);
    }

    /*
     * Iterating over string
     */
    static boolean searchCharacter(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    /*
     * converting string to character array
     */
    static boolean convertStrToCharArray(String str, char target) {
        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));
        for (char c : ch) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }

}
/*
 * There is many ways but:
 * 
 * 1) Iterate over string using for loop and use function .charAt(i) for
 * printing the character.
 * 2) convert string into character array using .toCharArray() and then process
 * like array.
 * 
 * Note :: foreach is not directly iterable in java because it doesnot implement
 * Iterable interface.
 * 
 * Learning
 * -------------
 * str.toCharArray() --> convert string to character array.
 * str.chatAt(i) --> print each character of string.
 * 
 */