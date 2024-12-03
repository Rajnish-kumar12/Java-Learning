/*
a) Pre Increment(++a)
-----------------------
--> Pre increment operator have highest priority first increase the value by one then perform any other operation.
    Ex: int a = 10; means a is assign to the variable in memory
        int b = ++a; first increase the value in memory and then assign to the b variable 
*/
class PreIncrement
{
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a);
    }
}
