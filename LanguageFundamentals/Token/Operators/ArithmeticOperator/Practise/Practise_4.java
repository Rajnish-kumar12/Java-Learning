/*
 * Practise_4
 */
class Practise_4
{
    public static void main(String[] args) {
        int a = 5;
        System.out.println(++a + a-- * --a + --a); // first perform increment and decrement from left to right
        //(6+6*4+3)
        //33
        System.out.println(a);
    }
}