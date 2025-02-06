package DSA.Recursion;

public class Factorial {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(findFactorial(n));
    }

    static int findFactorial(int n) {
        // Base Case
        // if (n < 2) {
        // return 1;
        // }
        // recursive call
        return n < 2 ? 1 : n * findFactorial(n - 1);
    }
}