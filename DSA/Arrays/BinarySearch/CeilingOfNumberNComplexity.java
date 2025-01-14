/*
 * Given array arr and target element
 * op :: output should be the smallest number which is greater then the target.
 * DO code in O(n) complexity.
 */
package DSA.Arrays.BinarySearch;

public class CeilingOfNumberNComplexity {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(findCeiling(arr,target));
    }
    static int findCeiling(int[] arr,int target){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == target){
                return arr[i];
            }
        }
        int index = 0;
        while(arr[index]<target){
            index++;
        }
        return arr[index];
    }
}