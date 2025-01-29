import java.util.Arrays;

public class FirstMissingPositive {

    public static void main(String[] args) {
        int[] arr = { 3, 4, -1, 1 };
        System.out.println(Arrays.toString(findFirstMissingPositive(arr)));
        System.out.println(first(arr));

    }

    static int first(int[] arr) {
        if (arr[0] > 1) {
            return 1;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] - arr[i - 1] > 1) {
                return arr[i - 1] + 1;
            }
        }
        return arr[arr.length - 1] + 1;
    }

    static int[] findFirstMissingPositive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}