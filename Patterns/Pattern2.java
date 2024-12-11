/*
 * Pattern 1
 * 
 * *
 * **
 * ***
 * ****
 * *****
 * 
 */
class Pattern_1 {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 * Pattern 1
 * 
 * 1
 * 22
 * 333
 * 4444
 * 55555
 * 
 */
class Pattern_2 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
 * Pattern 3
 * 
 * A
 * AB
 * ABC
 * ABCD
 * ABCDE
 * 
 */
class Pattern_3 {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + j) + "\t");
            }
            System.out.println();
        }
    }
}

/*
 * Pattern 4
 * 
 * A
 * BB
 * CCC
 * DDDD
 * EEEEE
 * 
 */
class Pattern_4 {
    public static void main(String[] args) {
        int num = 15;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + i) + "\t");
            }
            System.out.println();
        }
    }
}

/*
 * Pattern 5
 * 
 * *****
 * ****
 * ***
 * **
 * *
 * 
 */
class Pattern_5 {
    public static void main(String[] args) {
        int num = 10;
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 * Pattern_6
 * 
 * 12345
 * 1234
 * 123
 * 12
 * 1
 * 
 */
class Pattern_6 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*
 * Pattern 7
 * 
 * 11111
 * 2222
 * 333
 * 44
 * 5
 * 
 */
class Pattern_7 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=num-(i-1); j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
 * Pattern 8
 * 
 * ABCDE
 * ABCD
 * ABC
 * AB
 * A
 * 
 */
class Pattern_8
{
    public static void main(String[] args) {
        int num = 10;
        for(int i = 1;i<=num;i++)
        {
            for(int j =1;j<=num-(i-1);j++)
            {
                System.out.print((char)(64+j));
            }
            System.out.println();
        }
    }
}

/*
 * Pattern 9
 * 
 * AAAAA
 * BBBB
 * CCC
 * DD
 * E
 * 
 */
class Pattern_9
{
    public static void main(String[] args) {
        int num = 5;
        for(int i=1;i<=num;i++)
        {
            for(int j =1;j<=num-(i-1);j++)
            {
                System.out.print((char)(64+i));
            }
            System.out.println();
        }
    }
}