package DSA.Recursion;

public class NtoOne {

    public static void main(String[] args) {
        int n = 10;
        print(n);
    }

    static void print(int n) {
        // Base Case
        if (n < 1) {
            return;
        }
        System.out.println(n);
        // Recursive Function
        print(n - 1);
    }
}