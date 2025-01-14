package DSA.Functions;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter first number");
        num1 = input.nextInt();
        System.out.println("Enter second number");
        num2 = input.nextInt();
        swap(num1,num2);
    }

    static void swap(int x,int y) {
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);

    }
}

/*
 * Notes :: All the primitives value are pass by value.
 *          In Java, when you pass primitive data types (like int, float, etc.) to a method, 
 *          a copy of their value is passed, not their reference.
 */