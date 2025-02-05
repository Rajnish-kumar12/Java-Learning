package DSA.Recursion;

public class FibbonachiNumber {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(findFibo(n));
    }

    static int findFibo(int n) {
        if (n < 2) {
            return n;
        }
        return findFibo(n - 1) + findFibo(n - 2);
    }
}