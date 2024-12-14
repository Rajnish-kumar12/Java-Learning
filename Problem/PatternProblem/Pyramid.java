/*
 * Pyramid Star Pattern
 * 
 *    *
 *   ***
 *  *****
 * *******
 * 
 */
class PyramidStarPattern {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 * HollowPyramidStarPattern
 * 
 *     *
 *    * *
 *   *   *
 *  *     *
 * *********
 * 
 */
class HollowPyramidStarPattern {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            if (i == 1 || i == num) {
                for (int j = 1; j <= num - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= num - i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 1; j <= (2 * i - 1) - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 * Inverted Pyramid Star Pattern
 * 
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */
class InvertedPyramidStarPattern {
    public static void main(String[] args) {
        int num = 5;
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 * Inverted Hollow Pyramid Star Pattern
 * 
 * *********
 *  *     *
 *   *   *
 *    * *
 *     *
 */
class InvertedHollowPyramidStarPattern {
    public static void main(String[] args) {
        int num = 10;

        for (int i = num; i >= 1; i--) {
            if (i == 1 || i == num) {
                for (int j = 1; j <= num - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= num - i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int k = 1; k <= (2 * i - 1) - 2; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
