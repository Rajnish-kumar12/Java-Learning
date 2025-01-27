public class checkMountainArray {

    public static void main(String[] args) {
        int[] arr = { 0, 3, 2, 1 };
        System.out.println(checkMountain(arr));
    }

    static boolean checkMountain(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        for (int i = 1; i <= max; i++) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }
        for (int i = max + 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}