/*
 * To perform implicit type casting we have to asssign lower data type varaible to higher data type varaible
 */
class ImplicitOne{
    public static void main(String[] args) {
        byte a = 10;
        int b = a;
        System.out.println(b);
    }
}
/*
 * Above code observation by compiler and jvm
 * 
 * compiler --> 1) When compiler encounter int b = a, compiler recognize the right side variable data type and left side variable
 *                 data type.
 *              2) Compiler will check whether right side variable data type is compatible with left side variable data type or not.
 *              3) In, java all lower data type is comaptible with higher data type.
 *              4) If right side variable data type is not compatible with left side varibale data type then compiler will raise
 *                 the error (possible loss of precision{incompatible type error:possible lossy conversion}).
 *              5) If right side data type is compatible with left side variable data type and compiler will not raise error
 *                 and compiler will not perform any type casting.
 *              6) Compiler responsibility is only type checking, jvm have responsibility for conversion.
 * 
 * JVM     -->  jvm will perform 2 action
 *              1) jvm will convert right side variable data type to left side variable data type, implicitely.
 *              2) jvm will copy right side variable to left side variable.
 */             

class Test
{
    public static void main(String[] args) {
        byte b = 10;
        int i = b;
        System.out.println(b+" "+i);
    }
}
class Test1
{
    public static void main(String[] args) {
        int i = 10;
        byte a = i;
        System.out.println(a); // error
    }
}
class Test2
{
    public static void main(String[] args) {
        long a = 10;
        float f = a;
        System.out.println(f);
    }
}
class Test3
{
    public static void main(String[] args) {
        float f = 22.22f;
        double d = f;
        System.out.println(d);
    }
}
/*
 * Overall lower to higer is possible, higher to lower is not possible.
 */

class Test4
{
    public static void main(String[] args) {
        byte a = 128;
        System.out.println(a); //error , Incomatible possible lossy conversion from int to byte.here 128 is treated as higher data
                                // which is greater then byte it means int.
    }
}

class Test5
{
    public static void main(String[] args) {
        byte a = 60;
        System.out.println(a); //no error
    }
}

class Test6
{
    public static void main(String[] args) {
        byte a = 60;
        byte b = 70;
        byte c = a+b;
        System.err.println(a); // here error but we think 60+70=130, which is not in range of byte but this is not actual reason
    }
}
class Test7
{
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = a+b;
        System.out.println(c); // here also error reason is below
    }
}
/*
 * If we add two data type variable then the result of the respective operation may not be of same data type and it may be of the
 * next higher data type.
 * Rules
 * -------
 * x,y,z are three primitive data types.
 * x+y=z
 * condition 1:
 * if both x and y belongs to byte, short, int then z must be int.
 * condition 2:
 * if either x or y belongs to long,float,double then z must be higher of x,y as per implicit type casting chart.
 * 
 * Ex:
 * byte+byte = int
 * byte+short = int
 * int + int = int
 * byte + long = long
 * int + long = long
 * long + float = float
 * float + double = double
 */
