/*
 * Calculate Richest Customer Wealth
 */
package DSA.Arrays.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Your array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int balance = richestCustomer(arr);
        System.out.println("Richest Customer Wealth is : " + balance);
    }

    /*
     * Find richest customer
     */
    static int richestCustomer(int[][] arr) {
        int wealth = 0;
        int[] checkMaxWealth = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            wealth = sumWealth(arr[i]);
            checkMaxWealth[i] = wealth;

        }
        System.out.println("Your Maxwealth array are : ");
        System.out.println(Arrays.toString(checkMaxWealth));
        return checkMaxWealth(checkMaxWealth);
    }

    /*
     * Sum the wealth of each person
     */
    static int sumWealth(int[] person) {
        int calWealth = 0;
        for (int i = 0; i < person.length; i++) {
            calWealth = calWealth + person[i];
        }
        return calWealth;
    }

    /*
     * Calculate Max wealth
     */
    static int checkMaxWealth(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[0]) {
                max = arr[i];
            }
        }
        return max;
    }
}