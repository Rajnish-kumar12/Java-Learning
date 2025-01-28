public class NeitherMinimumnorMaximum {

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 4 };
        int[] sortedArray = sortArray(arr);
        System.out.println((sortedArray.length <= 2) ? -1 : sortedArray[1]);
    }

    static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
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