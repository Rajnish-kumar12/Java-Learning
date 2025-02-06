package DSA.Recursion;

public class OnetoN {

    public static void main(String[] args) {
        int n = 10;
        print(1);
    }

    static void print(int n) {
        // Base case
        if (n > 10) {
            return;
        }
        System.out.println(n);
        // Recursive function
        print(n + 1);
    }
}