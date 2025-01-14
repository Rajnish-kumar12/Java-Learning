
/*
 * Square Star Pattern
 * 
 * ****
 * ****
 * ****
 * ****
 * 
 */
class SquareStarPattern {
    public static void main(String[] args) {
        int num = 5;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
 * Hollow Square Star Pattern
 * 
 *  ****
 *  *  *
 *  *  *
 *  ****
 * 
 */
class HollowSquareStarPattern {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            if (i == 1 || i == num) {
                for (int j = 1; j <= num; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= num; j++) {
                    if (j == 1 || j == num) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
