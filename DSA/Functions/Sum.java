package DSA.Functions;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Sum {

    public static void main(String[] args) {
        sum();
        System.out.println("Now i am outside the function");
    }

    static void sum() {
        int num1, num2, sum;
        System.out.println("I am inside function");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1 = input.nextInt();
        System.out.println("Enter the second number");
        num2 = input.nextInt();
        sum = num1 + num2;

        System.out.println("sum is : " + sum);
    }
}