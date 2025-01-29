/*
 * 448. Find All Numbers Disappeared in an Array
 * 
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/?envType=problem-list-v2&envId=array
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumberInArray {

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 2, 2, 2, 2, 3, 1 };
        System.out.println(findCountOfDisappearedElement(arr));
    }

    static List<Integer> findCountOfDisappearedElement(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int validIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[validIndex]) {
                int temp = arr[i];
                arr[i] = arr[validIndex];
                arr[validIndex] = temp;
            } else {
                i++;
            }
        }
        List<Integer> missingNumbers = new ArrayList<>();
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] != x + 1) {
                missingNumbers.add(x + 1);
            }
        }
        return missingNumbers;
    }
}