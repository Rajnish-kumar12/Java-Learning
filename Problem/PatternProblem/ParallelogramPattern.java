/*
 * Parallelogram Star Pattern
 * 
 * ******
 *  ******
 *   ******
 *    ******
 * 
 */
class ParallelogramStarPattern
{
    public static void main(String[] args) {
        int num = 4;
        for(int i =1;i<=num;i++)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=num+2;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 * Mirrored Rhombus Star Pattern
 * 
 *    ****
 *   ****
 *  ****
 * ****
 * 
 */
class MirroredRhombusStarPattern
{
    public static void main(String[] args) {
        int num=4;
        for(int i =1;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=num;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

