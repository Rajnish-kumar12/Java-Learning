/*
 * Pattern 1
 * 
 *      **
 *     **** 
 *    ******
 *   ********
 *  **********
 * ************
 * 
 */
class Pattern_1
{
    public static void main(String[] args) {
        int num = 10;
        for(int i =1;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 * Pattern 2
 * 
 *     1 2
 *    1 2 3 4
 *   1 2 3 4 5 6
 *  1 2 3 4 5 6 7 8
 * 1 2 3 4 5 6 7 8 9 10
 * 
 */
class Pattern_2
{
    public static void main(String[] args) {
        int num = 5;
        for(int i =1;i<=num;i++)
        {
            for(int j =1;j<=num -i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}

/*
 * Pattern 3
 * 
 *     12
 *    1234
 *   123456
 *  12345678
 * 12345678910
 * 
 */
class Pattern_3
{
    public static void main(String[] args) {
        int num = 5;
        for(int i =1;i<=num;i++)
        {
            for(int j =1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

/*
 * Pattern 4
 * 
 *     AB
 *    ABCD
 *   ABCDEF
 *  ABCDEFGH
 * ABCDEFGHIJ
 * 
 */
class Pattern_4
{
    public static void main(String[] args) {
        int num=13;
        for(int i =1;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k =1;k<=2*i;k++)
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
 *    ***
 *   *****
 *  *******
 * *********
 * 
 */
class Pattern_5
{
    public static void main(String[] args) {
        int num=10;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 * Pattern 6
 * 
 *     A
 *    ABC
 *   ABCDE
 *  ABCDEFG
 * ABCDEFGHI
 * 
 */
class Pattern_6
{
    public static void main(String[] args) {
        int num =10;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print((char)(64+k));
            }
            System.out.println();
        }
    }
}

/*
 * Pattern 7
 * 
 *     A
 *    BBB
 *   CCCCC
 *  DDDDDDD
 * EEEEEEEEE
 * 
 */
class Pattern_7
{
    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print((char)(64+i));
            }
            System.out.println();
        }
    }
}