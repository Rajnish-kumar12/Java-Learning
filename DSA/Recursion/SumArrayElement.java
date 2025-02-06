package DSA.Recursion;

public class SumArrayElement {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println(sum(arr, arr.length));
    }

    static int sum(int[] arr, int length) {
        if (length <= 0) {
            return 0;
        }
        return arr[length - 1] + sum(arr, length - 1);
    }
}