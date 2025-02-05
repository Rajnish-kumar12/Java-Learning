package DSA.Recursion;

public class UnderstandingRecursion1 {

    public static void main(String[] args) {
        message1();
    }

    static void message1() {
        System.out.println("Rajnish");
        message2();
    }

    static void message2() {
        System.out.println("Rajnish");
        message3();
    }

    static void message3() {
        System.out.println("Rajnish");
        message4();
    }

    static void message4() {
        System.out.println("Rajnish");
        message5();
    }

    static void message5() {
        System.out.println("Rajnish");
    }
}