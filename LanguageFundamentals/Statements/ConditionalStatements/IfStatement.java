/* Types of syntaxes of If, If else, If else ladder.
------------------------------------------------------
class Syntax_1
{
    public static void main(String[] args) {
        if(condition){
            // Instruction
        }
    }
}
class Syntax_2
{
    public static void main(String[] args) {
        if(condition)
        {
            //instruction
        }else{
            //instruction
        }
    }
}
class Syntax_3
{
    public static void main(String[] args) {
        if(condition1){
            //instruction
        }else if(condition2){
            //statement
        }else if(condition3){
            //instruction
        }else{
            //instruction
        }
    }
}
*/
class Test{
    public static void main(String[] args) {
        int a = 10;
        if(a==10){
            System.out.println("a value is "+a);
        }
    }
}
class Test_1{
    public static void main(String[] args) {
        int a = 20;
        if(a>10){
            System.out.println(a+" is greater than 10.");
        }else{
            System.out.println(a+" a is less than 10.");
        }
    }
}
class Test_3{
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        if(a<b){
            System.out.println("b is greater than a");
        }else if(a>b){
            System.out.println("a is grater than b");
        }else{
            System.out.println("Both are equal");
        }
    }
}

/* 
 * Find the biggest numbers among three numbers
 */
class BiggestNumber{
    public static void main(String[] args) {
        int a = 40;
        int b = 40;
        int c = 40;
        if(a>b){
            if(a>c){
                System.out.println("a is greater");
            }else{
                System.out.println("c is greater");
            }
        }else if(b>c){
            if(b>a){
                System.out.println("b is grater");
            }else{
                System.out.println("a is grater");
            }
        }else if(c>a){
            if(c>b){
                System.out.println("c is grater");
            }else{
                System.out.println("b is greater");
            }
        }else{
            System.out.println("All are equal");
        }
    }
} 

/*
 * Find Whether given number is even number or odd number
 */
class EvenOrOdd{
    public static void main(String[] args) {
        int a = 15;
        if(a%2==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
    }
}

class Sample
{
    public static void main(String[] args) {
        int i = 10;
        int j;
        if(i==10){
            j=20;
            System.out.println(j); //no error because before access of j variable intialization done.
        }
        System.out.println(j);  //compilation error "Variable j might not have been initilized"
    }
}

/*
 * Reason of above error and for this error we have to understand some fundamentals concept in java below are:
 * --> 1) In java, defaults value are existed for only class level variables only, not for loacal variables, If we declare any varibale
 *        at class level without explicit initialization then JVM will provide default value for the respective clas level variable, but
 *        if we declare any local variable without explicit without initilization then JVM will not provide default value for the 
 *        respective local variable. If we declare local variable then we must provide initilization for local variable explicitely
 *        If we are trying to access local variable without providing initilization then compiler will raise an error like
 *        "variable xxx might not have been initialized".
 *        Ex:
 *        class A{
 *              int i;
 *              void m1()
 *              {
 *                  int j;
 *                  sop(i); no error and output is 0.
 *                  sop(j); compilation error.
 *                  j=20;
 * `                sop(j); no error output is 20.
 *              }
 *          }
 * 
 * -->  2) There are two types of conditional expression in java.
 *          a) Constant Expressions
 *          b) Variable Expressions
 * 
 *          a) Constant Expression
 *          -------------------------
 *          These expression is an expression which includes only constant(direct contant or final variables), these constants
 *          expression are evaluated by compiler.
 *             EX:
 *             if(10==10), if(true), final int i = 10 if(i==10){}.
 * 
 *          b) Variable Expressions
 *          -------------------------
 *          These expressions are able to include atleast one variable, It will be evaluated by JVM not by compiler.
 *          Ex: 1) int i=10;
 *                 if(i==10);
 * 
 *          Now letus understand what compiler will do and what jvm will do in the above sample class
 *          -------------------------------------------------------------------------------------------
 *          --> 
 */ 
class Sample_1
{
    public static void main(String[] args) {
        int i = 10;
        int j;
        if(i==10){
            j=20;
        }else{
            j=5;
        }
        System.out.println(j); /* No error  because here compiler understadn if not truethe else part is execute means intilization
                                 happens sure */
    }
}
class Sample_3
{
    public static void main(String[] args) {
        int i = 10;
        int j; // local variable without initilization
        if(i==10){
            j=20;
        }else if(i==20){
            j=30;
        }else{
            j=40;
        }
        System.out.println(j);  //here also no error because compiler know anyone of then j are execute if true or false.
    }
}

class Sample_4
{
    public static void main(String[] args) {
        final int i = 10;
        int j;
        if(10==10)
        {
            j=20;
        }
        System.out.println(j);  // output 10 because i is final and it is like constant and it is executes by compiler.
    }
}
class Sample_5
{
    public static void main(String[] args) {
        int j;
        if(true)
        {
            j=20;
        }
        System.out.println(j);  // output 10 because i is final and it is like constant and it is evaluated by compiler.
    }
}