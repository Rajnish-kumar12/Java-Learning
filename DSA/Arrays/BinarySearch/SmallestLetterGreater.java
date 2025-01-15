/*
 * Find smallest letter greater than target.
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/?envType=problem-list-v2&envId=binary-search
 */
package DSA.Arrays.BinarySearch;

public class SmallestLetterGreater {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        char target = 'd';
        char result = findTarget(letters, target);
        System.out.println(result);
    }

    static char findTarget(char[] arr, char target) {   
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (target < arr[mid]) {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }
        return arr[startIndex % arr.length];
    }
}
/*
 * key concept 
 * --------------
 * if no letter is greater than the target at that time fails the condition and at that time startIndex is equal to length of the array
 * and if we do module with array of length then idndex is 0 and we have to return that only if no any nextgreater found then.
 */