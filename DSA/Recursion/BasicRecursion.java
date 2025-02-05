/*
 * Function that call itself called recursion
 * 
 * Why recursion ?
 * --> It helps us in solving bigger and complex problem in simple way.
 * 
 * we can convert recursion solutions into iteration(using loops) and vice versa.
 * space complexty is not constant because of recursive calls.
 * 
 */
package DSA.Recursion;

public class BasicRecursion {

    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        // base condition
        if (n == 5) {
            System.out.println(n);
            return;
        } else {
            System.out.println(n);
            /*
             * Recursive call
             * --> If you are calling a function again and again, you can treat it as a
             * seperate call in the stack
             */
            print(n + 1);
        }
    }
}