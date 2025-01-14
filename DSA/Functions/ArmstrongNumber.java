package DSA.Functions;

import java.util.Scanner;

@SuppressWarnings("resource")
public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean result = checkArmStrongNumber(number);
        if (result) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
    }

    static boolean checkArmStrongNumber(int num) {
        int backup = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            sum = sum + (digit * digit * digit);
        }
        if (sum == backup) {
            return true;
        } else {
            return false;
        }
    }
}