/*
 * While Loop
 * ------------
 * In java applications if we dont know the number of loop iteration in advance before writting loop then we have to use while loop.
 */
class Syntax
{
    public static void main(String[] args) {
        int i = 1;
        while(i<=5)
        {
            System.out.println(i);
            i+=1;
        }
    }
}
class Example
{
    public static void main(String[] args) {
        int i = 10;
        while(i>0)
        {
            System.out.println(i);
            i-=1;
        }
    }
}
/*
 * In while loop conditional expression is mandatory
 */


 class Example_2
 {
    public static void main(String[] args) {
        System.out.println("before loop");
        int i = 0;
        while(i<=0 || i>=0)
        {
            System.out.println("inside loop");  //infinite loop
            i=i+1;
        }
        System.out.println("after loop");
    }
 }

 class Example_3
 {
    public static void main(String[] args) {
        System.out.println("before loop");
        int i = 0;
        while(true)
        {
            System.out.println("inside loop");  
            i=i+1;
        }
        System.out.println("after loop"); //compilation error unreachable statement.
    }
 }