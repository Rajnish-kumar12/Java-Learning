/* 
 * Time Complexity is O(N):
 */
import java.util.Arrays;

public class FirstAndLast {

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 7;
        int[] result = findOccurance(arr,target);
        System.out.println(Arrays.toString(result));
    }
    static int[] findOccurance(int[] arr,int target){
        int first = findFirstPosition(arr,target);
        int last = findLastPosition(arr,target);
        return new int[]{first,last};
    }
    static int findFirstPosition(int[] arr,int target){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    static int findLastPosition(int[] arr ,int target){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}