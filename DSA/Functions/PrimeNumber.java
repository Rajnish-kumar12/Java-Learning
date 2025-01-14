package DSA.Functions;

import java.util.Scanner;

@SuppressWarnings("resource")
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number that you want to check prime or not : ");
        int number = input.nextInt();
        boolean result = primeNum(number);
        if (result) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }

    static boolean primeNum(int num) {
        if (num == 2) {
            return true;
        }
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}