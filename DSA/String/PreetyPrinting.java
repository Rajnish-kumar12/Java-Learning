package DSA.String;

public class PreetyPrinting {

    public static void main(String[] args) {
        float a = 453.1274f;
        System.out.printf("Formatted number is %.1f%n", a);
        System.out.printf("Formatted number is %.3f%n", a);
        System.out.printf("Formatted number is %.4f%n", a);
        float b = 100;
        System.out.printf("Formatted price is %.2f%n", b);
        System.out.printf("%.3f\n", Math.PI);
        // Above example are to display digit after the point
        System.out.printf("Hello my name is %s and i am %s%n", "rajnish", "cool");
    }
}
/*
 * There are many format specifiers
 * 
 * %c = character
 * %f = float
 * %d = decimal (base 10)
 * %e = exponential
 * %i = Integer (base 10)
 * %s = string
 * %u = unsgined decimal
 * %x = hexadecimal (base 16)
 * %t = date/time
 * %n = newline
 */