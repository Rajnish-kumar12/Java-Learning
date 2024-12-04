/*
 * Boolean Logical Operators
 * ---------------------------
 * --> & (AND)
 * --> | (OR)
 * --> ^ (XOR)
 * 
 * Truth Table
 * -----------------------------
 * A  B  A&B  A|B  A^B
 * T  T   T    T    F
 * T  F   F    T    T
 * F  T   F    T    T
 * F  F   F    F    F
 * 
 */
class BooleanLogical
{
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        System.out.println(b1&b2);
        System.out.println(b1|b2);
        System.out.println(b1^b2);
        System.out.println(b1^b3);
    }
}