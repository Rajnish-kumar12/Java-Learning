/*
 * Practise_5
 */
class Practise_5
{
    public static void main(String[] args) {
        int a = 6;
        System.out.println((++a+--a)*(a--+--a)-(++a+--a)*(--a-++a));
        // ((7+6)*(6+4)-(5+4)*(3-4))
        // (13*10-9*-1)
        //139
        System.out.println(a);
    }
}