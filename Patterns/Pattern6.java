/*
 * Pattern 1
 * 
 *     *
 *    * *
 *   * * *
 *  * * * *
 * * * * * *
 *  * * * *
 *   * * *
 *    * *
 *     *
 */
class Pattern_1 {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}