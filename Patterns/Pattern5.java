/*
 * Pattern 1
 * 
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */
class Pattern_1
{
    public static void main(String[] args) {
        int num = 5;
        for(int i =num ;i>=1 ;i--)
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
 * Pattern 2
 * 
 * * * * * *
 *  * * * *
 *   * * *
 *    * *
 *     *
 * 
 */
class Pattern_2
{
    public static void main(String[] args) {
        int num =10;
        for(int i=num;i>=1;i--)
        {
            for(int j =1;j<=num-i;j++)
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
 * Pattern 3
 * 
 * 1 2 3 4 5 
 *  1 2 3 4
 *   1 2 3
 *    1 2
 *     1
 * 
 */
 class Pattern_3
 {
    public static void main(String[] args) {
        int num =10;
        for(int i =num;i>=1;i--)
        {
            for(int j=1;j<=num-i;j++)
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
 * Pattern 4
 * 
 * A A A A A
 *  B B B B
 *   C C C
 *    D D
 *     E
 * 
 */
class Pattern_4
{
    public static void main(String[] args) {
        int num = 9;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=num;k>=i;k--)
            {
                System.out.print((char)(64+i)+" ");
            }
            System.out.println();
        }
    }
}
