public class ShipPackages {

    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int k = 5;
        System.out.println("The Minimum of maximum weight are : " + findMinMax(weights, k));
    }

    static int findMinMax(int[] weights, int k) {
        int start = findPossibleStartWeight(weights);
        int end = findPossibleEndWeight(weights);
        int ans = weights[0];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int splitDays = findSplitDaysInMid(weights, mid);
            if (splitDays > k) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    static int findSplitDaysInMid(int[] weights, int mid) {
        int sum = 0;
        int count = 1;
        // for (int i = 0; i < weights.length; i++) {
        // if (weights[i] + sum > mid) {
        // sum = weights[i];
        // count++;
        // } else {
        // sum = sum + weights[i];
        // }
        // }
        for (int element : weights) {
            if (element + sum > mid) {
                sum = element;
                count++;
            } else {
                sum += element;
            }
        }
        return count;
    }

    static int findPossibleStartWeight(int[] weights) {
        int max = weights[0];
        // for (int i = 1; i < weights.length; i++) {
        // if (weights[i] > max) {
        // max = weights[i];
        // }
        // }
        for (int i : weights) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    static int findPossibleEndWeight(int[] weights) {
        int sum = 0;
        // for (int i = 0; i < weights.length; i++) {
        // sum = sum + weights[i];
        // }
        for (int i : weights) {
            sum += i;
        }
        return sum;
    }
}