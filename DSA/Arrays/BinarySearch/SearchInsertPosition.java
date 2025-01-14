/*
 * Search Insert Position
 * 
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * 
 */
package DSA.Arrays.BinarySearch;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] arr = { 1 };
        int target = 1;
        int result = searchElement(arr, target);
        System.out.println(result);
    }

    static int searchElement(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target >= arr[mid]) {
                startIndex = mid + 1;
            } else {
                endIndex = mid - 1;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(target<arr[i]){
                return i;
            }
        }
        return arr.length;
    }
}