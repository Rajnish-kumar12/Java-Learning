package DSA.Recursion;

public class UnderstandingRecursion2 {

    public static void main(String[] args) {
        /*
         * write a function which takes a number and print it.
         * print first five numbers 1,2,3,4,5
         */
        print1(1);
    }

    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }

    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }

    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }

    static void print5(int n) {
        System.out.println(n);
    }
}
/*
 * Above function calling other function, and body of the all function is the
 * same and working is same
 */