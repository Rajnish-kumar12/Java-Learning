package DSA.String;

public class Palindrome {

    public static void main(String[] args) {
        String str = "abcdmdcba";// example of palindrome aba,abcba
        boolean result = isPalindrome(str);
        System.out.println(result);

    }

    static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
}
/*
 * First way is to direct using reverse method and check both content is same or
 * not, using string builder class
 */