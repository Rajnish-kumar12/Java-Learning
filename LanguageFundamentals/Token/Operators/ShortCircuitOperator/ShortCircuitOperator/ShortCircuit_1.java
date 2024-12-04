/*
 * Short Cicuit Operators
 * -----------------------
 * --> The main intention of short circuit operator to improve performance of java application.
 * Ex: &&, ||
 */
class ShortCircuit
{
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        if(a++ == 10 || b++ == 10)
        {
            System.out.println(a+"  "+b);
        }
    }
}
class SingleOr
{
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        if(a++ == 10 | b++ == 10)
        {
            System.out.println(a+"  "+b);
        }
    }
}


/*
 * What is the difference between single | and double ||?
 * --> In | OR jvm will check both the statement that and then execute inside if but in the case of || if jvm get first 
 *     statement true then jvm do not go to check the second statement, because in the case of OR if any one are true then
 *     result is true.
 */