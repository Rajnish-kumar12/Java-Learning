/*
 * Double Reversed
 * 
 * https://leetcode.com/problems/a-number-after-a-double-reversal/?envType=problem-list-v2&envId=math
 * 
 */
public class DoubleReversed {

    public static void main(String[] args) {
        int number = 1800;
        int rev1 = check(number);
        System.out.println((check(rev1) == number) ? true : false);

    }

    static int check(int number) {
        int revNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            revNumber = (revNumber * 10) + digit;
        }
        return revNumber;
    }
}