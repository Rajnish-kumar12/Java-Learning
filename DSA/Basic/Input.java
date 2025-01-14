package DSA.Basic;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // system.in take input from the keyboard
        System.out.print("Please Enter Some Integer Value : ");
        int a = input.nextInt(); // next int for integer
        System.out.println("You are entring the value is : " + a);
        String s = input.nextLine(); // nextline for string
        System.out.println(s);
    }

}