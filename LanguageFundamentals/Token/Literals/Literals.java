/*
All About Literals in java.
--> Literal is the constant assigned to the variables.
*/
// class Literals
// {
//     public static void main(String[] args)
//     {
//         int a = 10;
//         System.out.println(a);
//     }
// }
/*
int == data-type
a == variable
= == operator
10 == literals/constant
; == terminator
*/

/*
To prepare java applications JAVA has provided following literals
1) Integral Literals / Integer Literals
----------------------------------------
byte 
short
int
long
char -> 'a', 'b', 'c', '\n', '\t' etc.

2) Floating Point Literals
---------------------------
float --> 22.22f, 33.33f etc.
double --> 234.456D, 345.456D etc.

3) Boolean Literals
---------------------
true
false

4) String Literals
--------------------
string --> "abc", "xyz", "10", "22.22", "4567.5435" etc.

*/

/*
To Improve Readability in Literals, java7 version has provided a special notation like to include '_' symbols inside the literals.
Ex:
    double d = 123456789.2345678 can be written as 12_34_56_789.2345678.
*/

class Test
{
    public static void main(String[] args)
    {
        double d = 12_34_56_789.2345678;
        System.out.println(d);
    }
}


/*
 * Number System In Java
 * -----------------------
 * To represent the numbers in all programming languages we nedd some standards, that standards are provided by Number System.
 * 1) Binary Number System [Base-2]
 * 2) Octal Number  System [Base-8]
 * 3) Decimal Number System [Base-10]
 * 4) Hexa-Deciaml Number System [Base-16]
 * Note : Java allows all number system, but, decimal number system is the deafault number system.
 */

/*
1) Binary Number System[Base-2]
-->  Alphabet: 0's and 1's
    prefix: 0b or 0B
    NOTE: Binary Number system is not allowing upto java 6 versions.
*/
class BinaryNumberSystem
{
    public static void main(String[] args)
    {
        int a = 10;
        System.out.println(a); //This print 10 beacause default number system is decimal number system
        int z = 0b10;  //0*2power0+1*2power1
        System.out.println(z);
    }
}


/*
1) Octal Number System[Base-8]
--> Alphabet: 1,2,3,4,5,6,7
    prefix: 0[zero]
*/
class OctalNumberSystem
{
    public static void main(String[] args) {
        int a = 10;  
        System.out.println(a);  // It print 10 because it is default decimal number system
        int p = 010;
        System.out.println(p);  //0*8power0+1*8power1
        int f = 10; //not octal
        int b = 01234; //octal
        int c = 023456; //octal
        int d = 04567; //octal
        int e = 05678; //not octal
    }
}

/*
Decimal Number System [Base-10]
--> Alphabet: 0,1,2,3,4,5,6,7,8,9
    No prefix value existed
*/
class DecimalNumberSystem
{
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
    }
}

/*
HexaDecimal Number System
-->  Alphabet: 0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f
     prefix: 0x or OX
*/
class HexaDecimaNumberSystem
{
    public static void main(String[] args) {
        int a = 0xef0; 
        System.out.println(a);
        int b =10; //not hexadecimal
        int c = 0x123456; //hexadecimal
        int d = 0X789abc; //hexadecimal
        int e = 0Xdefg; //not hexadecimal
    }
}

/*
 * Out of this number system only binary number system introduced from java 7 version, other all are introduced in java first version.
 * In java applications if we epresent any number in any number system then compiler will recognize the provided number system on the basis
 * of prefix value then compiler will convert the provided number from the provided number system into decimal number system then compiler
 * and jvm will process number as like decimal number and generate output in decimal number system.
 */

/*
 * We can perform operations also between same number system as well as betwee difference number system
 */
class Operation_1
{
    public static void main(String[] args) {
        int a = 10;
        int b = 0b10;
        System.out.println(a+b);
    }
}
class Operation_2
{
    public static void main(String[] args) {
        int a = 0x10;
        int b = 010;
        System.out.println(a+b);
    }
}

/*
Find the Number Systems of the following numbers

1)int a = 100; --> Decimal
2)int b = 0b1100; --> Binary
3)int c = 01234; --> Octal
4)int d = OB1110; --> Binary
5)int e = 0x1abc; --> Hexadecimal
6)int f = 0X567; --> Hexadecimal
*/
