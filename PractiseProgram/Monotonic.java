public class Monotonic {

    public static void main(String[] args) {
        int[] nums = { 1, 3, 2 };
        if (nums[0] < nums[nums.length - 1]) {
            System.out.println(checkMonotonic(nums));
        } else {
            System.out.println(checkMonotonicNew(nums));
        }
    }

    static boolean checkMonotonic(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (!(nums[i] >= nums[i - 1])) {
                return false;
            }
        }
        return true;
    }

    static boolean checkMonotonicNew(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (!(nums[i] <= nums[i - 1])) {
                return false;
            }
        }
        return true;
    }
}