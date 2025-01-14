package DSA.Functions;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Sum_1 {

    public static void main(String[] args) {
        int sumVal = sumOfTwoNumbers();
        System.out.println("sum is " + sumVal);
    }

    static int sumOfTwoNumbers() {
        int num1, num2, sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1 = input.nextInt();
        System.out.println("Enter the second number");
        num2 = input.nextInt();
        sum = num1 + num2;
        return sum;
    }
}