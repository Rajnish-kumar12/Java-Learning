class ShortCircuitAnd
{
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        if(a++ == 20 && b++ == 20)
        {
            System.out.println(a+" "+b);
        }
        else{
            System.out.println(a+" "+b);
        }
    }
}
class Andone
{
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        if(a++ == 20 & b++ == 20)
        {
            System.out.println(a+" "+b);
        }
        else{
            System.out.println(a+" "+b);
        }
    }
}

/*
 * What is the difference between single & and double &&?
 * --> In & AND jvm will check both the statement that and then execute inside if but in the case of && if jvm get first 
 *     statement false then jvm do not go to check the second statement, because in the case of ANS if any one are false then
 *     result is false.
 */