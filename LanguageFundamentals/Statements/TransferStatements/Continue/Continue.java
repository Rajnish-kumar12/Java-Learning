/*
 * In general we will use continue statement in loops, It can we use used to skip all the remaining instruction in the current iteration
 * and continue with next iteration.
 */
class Syntax {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}

/*
 * If we provide any statement after continue statement then that statement is unreachable statment then compiler will raise error.
 */
class Example {
    public static void main(String[] args) {
        System.out.println("Before Loop");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Inside loop before continue");
                continue;
                System.out.println("Inside loop after continue"); //compilation error because once time it is unreachable
            }
            System.out.println(i);
        }
        System.out.println("Outside loop");
    }
}

/*
 * If we provide continue statment inside nested loop then continue statement will give affect to only nested loop
 * it will not give affect to outer loop.
 */
class Example_2
{
    public static void main(String[] args) {
        for(int i = 0;i<10;i++)
        {
            for(int j = 0;j<10;j++)
            {
                if(j==5)
                {
                    continue;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}

/*
 * Labelled continue statements
 */
class Example_3
{
    public static void main(String[] args) {
        l1:for(int i = 0;i<10;i++)
        {
            for(int j = 0;j<10;j++)
            {
                if(j==5)
                {
                    continue l1;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}