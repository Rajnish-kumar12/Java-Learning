/*
 * Pattern 1
 * 
 *  *****
 *  *****   
 *  *****
 *  *****
 *  *****
 * 
 */
class Pattern_1 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < num; j++) {
                System.out.print("*"); // \t is equal to 1 tab space.
            }
            System.out.println();
        }
    }
}

/*
 * Pattern 2
 * 
 * 12345
 * 12345
 * 12345
 * 12345
 * 12345
 * 
 */
class Pattern_2 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}

/*
 * pattern 3
 * 
 * 11111
 * 22222
 * 33333
 * 44444
 * 55555
 */
class Pattern_3 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
 * pattern 4
 * 
 * ABCDE
 * ABCDE
 * ABCDE
 * ABCDE
 * ABCDE
 * 
 */
class Pattern_4 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print((char) (64 + j));
            }
            System.out.println();
        }
    }
}

/*
 * pattern 5
 * 
 * AAAAA
 * BBBBB
 * CCCCC
 * DDDDD
 * EEEEE
 * 
 */
class Pattern_5 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print((char) (64 + i));
            }
            System.out.println();
        }
    }
}