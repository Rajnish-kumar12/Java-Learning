/*
Post Decrement Operator
------------------------
--> Post decrement operator have the lowest priority first  perform other operation then update the decremented value in 
    memory.
    Ex: int a = 10; It means value is assign to the variable a in memory
        System.out.println(a); first print then it update the memory from 10 to 9
*/
class PostDecrement
{
    public static void main(String[] args) {
        int a =10;
        System.out.println(a--);
        System.out.println(a);
    }
}