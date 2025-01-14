package DSA.Arrays;

public class MaxItemArray {

    public static void main(String[] args) {
        int[] arr = { 40, 3, 23, 9, 180 };
        System.out.println(max(arr));
    }

    static int max(int[] num) {
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
}