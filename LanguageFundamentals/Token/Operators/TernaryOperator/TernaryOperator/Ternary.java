/*
 * Ternary Operator
 * -------------------
 * --> Ternary operator include three expression where first expresion is conditional expression.
 *     if the conditional expression return true then expression 2 will be executed.
 *     if the conditional expression is false then expression 3 will be executed.
 */
class Ternary
{
    public static void main(String[] args) {
        System.out.println(true?"Rajnish":"kumar");
        System.out.println(false?"Rajnish":"kumar");
    }
}
class Test
{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int min = (a<b)?a:b;
        System.out.println(min);
    }
}