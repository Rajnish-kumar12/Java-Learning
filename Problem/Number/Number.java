/*
 * Basic Square 1 Pattern
 * 
 * 11111
 * 11111
 * 11111
 * 11111
 * 11111
 * 
 */
class BasicSquare1Pattern {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}

/*
 * Basic Square incrementing Pattern
 * 
 * 11111
 * 22222
 * 33333
 * 44444
 * 55555
 * 
 */
class BasicSquareincrementingPattern {
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
 * Internal varsity square Pattern
 * 
 * 333
 * 313
 * 323
 * 333
 * 
 */
class InternalvarsitysquarePattern
{
    public static void main(String[] args) {
        int num =10;
        for(int i = 1;i<=num;i++)
        {
            if(i==1 || i==num)
            {
                for(int j=1;j<=3;j++){
                    System.out.print("3");
                }
            }else{
                for(int j=1;j<=3;j++){
                    if(j==2){
                        System.out.print(i-1);
                    }else{
                        System.out.print("3");
                    }
                }
            }
            System.out.println();
        }
    }
}

/*
 * Basic Right Triangle Number Pattern
 * 
 * 1
 * 23
 * 456
 * 78910
 * 
 */
class BasicRightTriangleNumberPattern
{
    public static void main(String[] args) {
        int num = 5;
        int displayVar = 1;
        for(int i =1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(displayVar);
                displayVar++;
            }
            System.out.println();
        }
    }
}

/*
 * Basic Right Triangle Number Pattern (Inverted-1)
 * 
 * 10987
 * 654
 * 32
 * 1
 * 
 */
class BasicRightTriangleNumberPatternInverted1
{
    public static void main(String[] args) {
        int num = 4;
        int var = 10;
        for(int i=num;i>=1;i--)
        {
            for(int j=1;j<=i;j++){
                System.out.print(var);
                var--;
            }
            System.out.println();
        }
    }
}


/*
 * Basic incrementing Triangle Pattern initialised  3
 * 
 * 6666
 * 555
 * 44
 * 3
 * 
 */
class BasicincrementingTrianglePatterninitialised3
{
    public static void main(String[] args) {
        int row = 10;
        int p = 6;
        for(int i=row;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(p);

            }
            p--;
            System.out.println();
        }
    }
}


/*
 * Basic incrementing Triangle Pattern 4
 * 
 * 3
 * 44
 * 555
 * 6666
 * 
 */
class BasicincrementingTrianglePattern4
{
    public static void main(String[] args) {
        int row=4;
        int start=3;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(start);
            }
            start++;
            System.out.println();
        }
    }
}

/*
 * Basic incrementing Triangle Pattern 5
 * 
 * 3
 * 4 5 
 * 6 7 8
 * 9 10 11 12
 * 
 */
class BasicincrementingTrianglePattern5
{
    public static void main(String[] args) {
        int row = 4;
        int start = 3;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
        }
    }
}

/*
 * Inverted Triangle with Descending Digits
 * 
 * 7 6 5 4 3 2 1
 * 7 6 5 4 3 2
 * 7 6 5 4 3
 * 7 6 5 4
 * 7 6 5
 * 7 6
 * 7
 * 
 */
class InvertedTrianglewithDescendingDigits
{
    public static void main(String[] args) {
        int start = 10;
        int p=1;
        for(int i=start;i>=1;i--){
            for(int j=start;j>=p;j--){
                System.out.print(j+" ");
            }
            p++;
            System.out.println();
        }
    }
}

/*
 * Triangle with Repeating Pattern
 * 
 * 1
 * 1 2 1
 * 1 2 3 2 1
 * 1 2 3 4 3 2 1
 * 1 2 3 4 5 4 3 2 1
 * 1 2 3 4 5 6 5 4 3 2 1
 * 1 2 3 4 5 6 7 6 5 4 3 2 1
 * 
 */
class TriangleWithRepeatingPattern
{
    public static void main(String[] args) {
        int row = 7;
        for(int i =1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}