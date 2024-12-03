/*
 * Operators is a symbol, which perform a particular operation over the provided operands.
 * To prepare java applications, JAVA has provided the following set of operators
 * 
 * 1) Arithmetic Operators
 * ------------------------
 * +, -, /, *, %, ++, --
 * 
 * 2) Assignment Operators
 * -------------------------
 * =, +=, -=, /=, %= *= etc..
 * 
 * 3) Compariason Operators
 * --------------------------
 * ==, !=, <, >, <=, >=
 * 
 * 4) Boolean Logical Operators
 * -----------------------------
 * &, |, ^
 * 
 * 5) Bitwise Logical Operators
 * ------------------------------
 * &, |, ^, <<, >>
 * 
 * 6) Ternary Operator
 * --------------------
 * expression1?expression2:expression3;
 * 
 * 7) Short Circuit Operator
 * --------------------------
 * &&, ||
 * 
 */

/*
1) Arithmetic Operators 
--------------------------
--> These Operators are used to perform Arithmetic Operations.
    Ex: + addition
        - substraction
        * multiplication
        / division
        % modular(for reminder)
        ++ increment
        -- decrement
*/
class ArithmeticOperator
{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        float div = (float) a / b;
        int rem = b % a;
        System.out.println("Addition = " + add);
        System.out.println("Substraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);
        System.out.println("Reminder = " + rem);
    }
}

/*
Increment Operator(++)
--> To increase the value by one
a) Pre Increment(++a)
b) Post Increment(a++)
*/
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
        int b = 20;
    }
}

/*
b) Post Increment(a++)
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

/*
Decrement Operator(--)
--> To deccrease the value by one.
a) Pre Decrement(--a)
b) Post Decrement(a++)
*/

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

/*
 * Practise
 */
class Practise
{
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a); // 10
        System.out.println(a++); //10
        System.out.println(++a); //12
        System.out.println(a--); //12
        System.out.println(--a); //10
        System.out.println(a); //10
    }
}

/*
 * Practise_1
 * ++ have highest priority than --
 * id
 * ++ , --
 * ()
 * *, /, % Left Association
 * +, -  Left Association
 * $
 */
class Practise_1
{
    public static void main(String[] args) {
        int a = 6;
        System.out.println(++a + --a);
    }
}

/*
 * checking left associativity means those operator comes in left having most priority
 */
class Practise_2
{
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        int c = 1;
        System.out.println(a/b*c);
    }
}

/*
 * Practise_3
 */
class Practise_3
{
    public static void main(String[] args) {
        int a = 5;
        System.out.println(++a + a-- * --a + --a); // first perform increment and decrement from left to right
        //(6+6*4+3)
        //33
        System.out.println(a);
    }
}

/*
 * Practise_4
 */
class Practise_4
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

/*
 * Assignment/ Comparison/ Boolean Operators
 */