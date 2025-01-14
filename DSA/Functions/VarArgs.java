package DSA.Functions;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        fun(2,3,4,5,5,6,6,7,8);
        multiple(10, 20,30, "Rajnish","Vishal","Avinash");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a,int b,int c,String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(Arrays.toString(v));
    }
}
/*
 * Note :: Var args return the array of the arguments.
 *         Var args treated as array.
 *         In one method only one var args paramter should be there.
 *         If there is more that one parameter in method then var args should be the last.
 *         
 */