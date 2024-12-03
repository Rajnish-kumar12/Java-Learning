/*
Pre Decrement Operator
------------------------
--> Pre decrement operator have the highest priority first decrease the value and update in memory then perform
    other operation.
    Ex: int a = 10; It means value is assign to the variable a in memory
        System.out.println(a); here first value update in memory from 10 to 9 and then print.
*/
class PreDecrement
{
    public static void main(String[] args) {
        int a =10;
        System.out.println(--a);
    }
}
