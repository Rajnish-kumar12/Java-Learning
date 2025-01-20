/*
 * Find Smallest letter greater than target.
 * 
 * Input: letters = ["c","f","j"], target = "a"
 * Output: "c"
 * if not exist return first character in letter array.
 * 
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/?envType=problem-list-v2&envId=binary-search
 * 
 */
public class SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] letters = { 'x','x','y','y' };
        char target = 'z';
        System.out.println(checkElement(letters, target));
    }

    static char checkElement(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }
}