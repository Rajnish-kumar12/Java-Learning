public class MaximumCount {

    public static void main(String[] args) {
        int[] arr = { -2, -1, -1, 1, -1, -4, 2, 3, 0, 10, 14, 15 };
        System.out.println(findCount(arr));
    }

    static int findCount(int[] arr) {
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            } else if (arr[i] > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }
        return (positiveCount > negativeCount) ? positiveCount : negativeCount;
    }
}