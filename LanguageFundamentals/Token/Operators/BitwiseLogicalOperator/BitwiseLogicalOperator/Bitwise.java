/*
 * Bitwise Operator
 * -----------------
 * --> These operators are applied on bits, here we use o's and 1's instead of false and true in truth table.
 * Ex: &, |, ^, <<, >>
 * 
 * Truth Table
 * -----------------
 * 
 * A  B  A&B  A|B  A^B
 * 0  0   0    0    0
 * 0  1   0    1    1
 * 1  0   0    1    1
 * 1  1   1    1    0
 * 
 */
class Bitwise
{
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(a<<b);
        System.out.println(a>>b);
    }   
}
/*
Above Bitwise operator internally working
-->First internally data converted into bits
int a = 10 -->  1010
int a = 2  -->  0010
-------------------------------------------
a&b-----------> 0010 ==> 2, so output is 2
a|b-----------> 1010 ==> 10, so output is 10
a^b-----------> 1000 ==> 8, so output is 8

a<<b---------->10<<2 ==> 
first convert both of them in 8 bit form means 
10 --> 4 bit form is 1010 but 8 bit form is 00001010
then,
not left shift means remove two what ever it is sysmbol from left side and append 2 0's symbols in right side like below
00101000 = 32+8 = 40

10>>2
first change in 8 bit form
10 --> 00001010

10>>2
from 2 remove 2 symbol from right side and append two 0's at left side

00000010 = 2 

*/