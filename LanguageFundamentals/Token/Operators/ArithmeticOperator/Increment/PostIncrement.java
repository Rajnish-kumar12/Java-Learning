/*
Post Increment(a++)
-----------------------
--> Post increment operator have lowest priority first perform the operation then increase the value of variable by one.
    Ex: int a = 10; means a is assign to the variable in memory.
        int b = a++; first assign to the b variable then increase by one.
*/
class PostIncrement
{
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++); // Here first assign the value in a then increase by one in memory
        System.out.println(a); // so when i print again a then it is 11
    }
}
