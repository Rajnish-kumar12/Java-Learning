/*
 * Pattern 1
 * 
 *     *
 *    **
 *   ***
 *  ****
 * *****
 * 
 */
class Pattern_1 {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

/*
 * Pattern 2
 * 
 *     1
 *    12
 *   123
 *  1234
 * 12345
 * 
 */
class Pattern_2 {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

/*
 * Pattern 3
 * 
 *     1
 *    22
 *   333
 *  4444
 * 55555
 * 
 */
class Pattern_3 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
 * Pattern 4
 * 
 *     A
 *    AB
 *   ABC
 *  ABCD
 * ABCDE
 * 
 */
class Pattern_4
{
    public static void main(String[] args) {
        int num =26;
        for(int i =1;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print((char)(64+k));
            }
            System.out.println();
        }
    }
}

/*
 * Pattern 5
 * 
 *     *
 *    * *
 *   * * *
 *  * * * * 
 * * * * * *
 * 
 */
class Pattern_5
{
    public static void main(String[] args) {
        int num = 10;
        for(int i =1;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
 * Pattern 6
 *     
 *     1
 *    1 2
 *   1 2 3
 *  1 2 3 4
 * 1 2 3 4 5
 * 
 */
class Pattern_6
{
    public static void main(String[] args) {
        int num = 5;
        for(int i =1 ;i<=num;i++)
        {
            for(int j =1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}

/*
 * Pattern 7
 * 
 *     A
 *    A B
 *   A B C
 *  A B C D
 * A B C D E
 * 
 */
class Pattern_7
{
    public static void main(String[] args) {
        int num = 5;
        for(int i =1;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print((char)(64+k)+" ");
            }
            System.out.println();
        }
    }
}