/*
 * Find Smallest letter greater than target.
 * 
 * Input: letters = ["c","f","j"], target = "a"
 * Output: "c"
 * if not exist return first character in letter array.
 * 
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 * description/?envType=problem-list-v2&envId=binary-search
 * 
 */
public class SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] arr = { 'c', 'f', 'j', 'k', 'o', 'r', 't' };
        char target = 'z';
        System.out.println(findSmallestLetterGreaterThanTarget(arr, target));
    }

    static char findSmallestLetterGreaterThanTarget(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return target;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }
}