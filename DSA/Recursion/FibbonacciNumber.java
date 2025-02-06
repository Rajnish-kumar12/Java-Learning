package DSA.Recursion;

public class FibbonacciNumber {

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
/*
 * findFibo(4)
 * ├── findFibo(3)
 * │ ├── findFibo(2)
 * │ │ ├── findFibo(1) → 1
 * │ │ ├── findFibo(0) → 0
 * │ │ → returns 1
 * │ ├── findFibo(1) → 1
 * │ → returns 2
 * ├── findFibo(2)
 * │ ├── findFibo(1) → 1
 * │ ├── findFibo(0) → 0
 * │ → returns 1
 * → returns 3
 * 
 */
