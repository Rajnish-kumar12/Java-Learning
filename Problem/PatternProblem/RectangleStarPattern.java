/*
 * Rectangle Star Pattern
 * 
 * ******
 * ******
 * ******
 * ******
 * 
 */
class RectangleStarPattern {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num + 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 * Hollow Rectangle Star Pattern
 * 
 * ******
 * *    *
 * *    *
 * ******
 * 
 */
class HollowRectangleStarPattern {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            if (i == 1 || i == num) {
                for (int j = 1; j <= num + 2; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= num + 2; j++) {
                    if (j == 1 || j == num + 2) {
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
