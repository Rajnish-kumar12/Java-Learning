package DSA.Recursion;

public class ProductArrayElement {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(prod(arr, arr.length));
    }

    static int prod(int[] arr, int length) {
        if (length == 0) {
            return 1;
        }
        return arr[length - 1] * prod(arr, length - 1);
    }
}