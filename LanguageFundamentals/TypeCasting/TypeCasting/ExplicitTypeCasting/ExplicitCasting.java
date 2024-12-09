class Explicit
{
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte) i;
        System.out.println(b);
    }
}
/*
 * Internal working of compiler and jvm
 * compiler --> 1) Compiler will recognize cast operator provided data type and left side variable data type.
 *              2) Compiler will check whether cast operator  provided data type is compatible with left side
 *                 variable data type or not.
 *              3) If the cast operator provided data type is not compatible with left side variable data type 
 *                 then compiler will raise the error as same like implicit.
 *              4) if the cast operator is compatible with the left side variable data type then compiler will not 
 *                 raise any error, and compiler will not perform any type casting, because, in java, compiler  is
 *                 responsible for type checking only, compiler will not responsible for type casting, JVM is responsibl
 *                 type casting.
 * 
 * JVM  --> 1) jvm will convert right side  variable data type to cast operator provided data type at right side only(EXPLICIT).
 *          2) jvm will copy the value from  right side variable to left side variable.
 */
class Test1
{
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte) i;
        System.out.println(b);
        short s = (short) i;
        System.out.println(s);
        short p = (byte) i;
        System.out.println(p);

    }
}
class Test2
{
    public static void main(String[] args) {
        byte b = 65;
        char c = (char) b;
        System.out.println(b+" "+c);
    }
}
class Test3
{
    public static void main(String[] args) {
        char c = 'A';
        byte b = (byte) c;
        System.out.println(c+" "+b);
    }
}
/*
 * implicit type casting between byte and char and char and byte is not available
 */

 class FloatToLong
 {
    public static void main(String[] args) {
        float f = 22.22f;
        long l = (long) f;
        System.out.println(l);
    }
 }
 class DoubleToLong
 {
    public static void main(String[] args) {
        double d = 22.22d;
        float f = (float) d;
        System.out.println(f);
    }
 }
 class IntToByte
 {
    public static void main(String[] args) {
        int i = 130;
        byte b = (byte) i; // output is -126 value change  beacause 130 is not available in byte so it followe cycle.
        System.out.println(b);
        int k = 140;
        byte c = (byte) k;
        System.out.println(c); // output 140-127=13-1=12+(-128)=116

    }
 }
/*
 * How to find -126
 * 
 * b = 130 - 127(higher bound) -> 3 then do -1 --> 2 then plus lower bound -128 == -126.
 * 
 */

 class Example
 {
    public static void main(String[] args) {
        byte b1 = 60;
        byte b2 = 70;
        byte b = (byte) (b1 + b2); // output is not 130 -> 130-127=3-1=2+(-128)=-126
        System.out.println(b);
    }
 }

 class Example_1
 {
    public static void main(String[] args) {
        byte b1 = 30;
        byte b2 = 30;
        byte b = (byte) (b1 + b2);
        System.out.println(b);
    }
 }

 class Example_2
 {
    public static void main(String[] args) {
        double d = 22.22;
        byte b = (byte)(int)(long)(float)(double) d;
        System.out.println(b);
    }
 }