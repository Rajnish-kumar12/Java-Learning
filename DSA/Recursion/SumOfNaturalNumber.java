package DSA.Recursion;

public class SumOfNaturalNumber {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(SumOfNaturalNumber(n));
    }

    static int SumOfNaturalNumber(int n) {
        if (n == 1) {
            return 1;
        }
        return n + SumOfNaturalNumber((n - 1));
    }
}