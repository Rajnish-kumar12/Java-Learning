/*
 * Sum of Square numbers
 * Given a non-negative integer c, decide whether
 * there're two integers a and b such that a2 + b2 = c.
 */
public class SumOfSquare {

    public static void main(String[] args) {
        int num = 5;
        System.out.println(checkSumOfSquareNumber(num));
    }

    static boolean checkSumOfSquareNumber(int num) {
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num; j++) {
                if (((i * i) + (j * j)) == num) {
                    return true;
                }
            }
        }
        return false;
    }
}
/*
 * Above code is right but time limit exceed.
 */
