package DSA.Functions;

import java.util.Scanner;

@SuppressWarnings("resource")

public class Sum_2 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First number");
        num1 = input.nextInt();
        System.out.println("Enter the second number");
        num2 = input.nextInt();
        int result = sum(num1, num2);
        System.out.println("sum is "+result);
    }

    static int sum(int x, int y) {
        return x + y;
    }
}