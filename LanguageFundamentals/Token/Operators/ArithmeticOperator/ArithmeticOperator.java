/*
Arithmetic Operators 
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
