/*
 * 754. Reach a Number (Leetcode)
 * 
 * https://leetcode.com/problems/reach-a-number/description/?envType=problem-list-v2&envId=binary-search
 * 
 */
public class ReachNumber {

    public static void main(String[] args) {
        int target = 5;
        System.out.println(findMinimumStep(target));
    }

    static int findMinimumStep(int target) {
        if (target < 0) {
            target = target * (-1);
        }
        int sum = 0;
        int step = 0;
        while (true) {
            if (sum >= target && (sum - target) % 2 == 0) {
                return step;
            }
            step++;
            sum = sum + step;
        }
    }
}