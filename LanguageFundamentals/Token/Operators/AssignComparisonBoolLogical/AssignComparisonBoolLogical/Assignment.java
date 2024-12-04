/*
 * Assignment Operator
 * --------------------
 * Used to copy the value from left to the right.
 * Ex: =, +=, -=, *=, /= etc.
 */
class Assignment
{
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        a += 10; // a = a + 10;
        System.out.println(a);
        a -= 5; // a = a - 5;
        System.out.println(a);
        
        int c = 5;
        c *= 2;      // c = c*2
        System.out.println(c);

        int d = 20;
        d /= 2;
        System.out.println(d);

        int p = 30;
        p %=4;
        System.out.println(p);
    }
}