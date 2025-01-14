package DSA.Functions;

public class Shadowing {
    static int x = 90;// this will be shadowed at line no 8.

    public static void main(String[] args) {
        System.out.println(x);
        int x = 40; // class variable at line 4 is shdowed by this line.
        System.out.println(x);
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
/*
 * scope will begin when value is initialized, shadowing concept is only in
 * class level variable.
 */