/*
 * Sum of two number without functions
 */
package DSA.Functions;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Methods_1 {
    public static void main(String[] args) {
        int num1, num2, sum;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1 = input.nextInt();
        System.out.println("Enter the second number");
        num2 = input.nextInt();
        sum = num1 + num2;

        System.out.println("sum is : " + sum);
    }

}