public class PerfectSquareUsingBinarySearch {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(check(num));
    }

    static int check(int num) {
        int start = 0;
        int end = num;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (((long) mid * mid) == num) {
                return mid;
            } else if (((long) mid * mid) > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}