/*
 * Rhombus Star Pattern
 *
 * ****
 *  ****
 *   ****
 *    ****
 * 
 */
class RhombusStarPattern
{
    public static void main(String[] args) {
        int num = 10;
        for(int i =1;i<=num;i++)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }   
            for(int k = 1;k<=num;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

