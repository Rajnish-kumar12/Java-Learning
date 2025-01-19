class Practise {
    public static void main(String[] args) {
        int a = 11;
        int b = 20;
        System.out.println("Addition " + (a + b));
        System.out.println("substraction " + (a - b));
        System.out.println("Division " + (float) b / a);
    }
}

class Increment {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a);
        System.out.println(a);
        int b = 20;
        System.out.println(b++);
        System.out.println(b);
    }
}
//decrement class
class Decrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(--a);
        System.out.println(a);
        int b = 20;
        System.out.println(b--);
        System.out.println(b);

    }
}

class Test {
    public static void main(String[] args) {
        int a = 6;
        System.out.println(++a + --a);
        int b = 5;
        System.out.println(++b + b-- * --b + --b);
    }
}

class ImplicitByteToShort {
    public static void main(String[] args) {
        byte b = 10;
        short a = b;
        System.out.println(a);
    }
}

class ImplicitShortToInt {
    public static void main(String[] args) {
        short s = 10;
        int i = s;
        System.out.println(i);
    }
}

class ImplicitCharToShort {
    public static void main(String[] args) {
        char c = 'A';
        // short s = c;
        // System.out.println(s); type mismatch

    }
}

class ImplicitCharToInt {
    public static void main(String[] args) {
        char c = 'A';
        int i = c;
        System.out.println(i);
    }
}

class ImplicitIntToFloat {
    public static void main(String[] args) {
        int i = 10;
        float f = i;
        System.out.println(f);
    }
}

class ImplicitFloatToDouble {
    public static void main(String[] args) {
        float f = 10.0f;
        System.out.println("Data type: " + ((Object) f).getClass().getSimpleName());
        double d = f;
        System.out.println("Data type: " + ((Object) d).getClass().getSimpleName());
        System.out.println(d);
    }
}

class DataTypeCheck {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Data type: " + ((Object) i).getClass().getSimpleName()); // Output: Integer
    }
}

class ExplicitShortbyte {
    public static void main(String[] args) {
        short s = 10;
        System.out.println("Data type: " + ((Object) s).getClass().getSimpleName());
        byte b = (byte) s;
        System.out.println("Data type: " + ((Object) b).getClass().getSimpleName());
    }
}

class ExplicitIntShort {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Data type: " + ((Object) i).getClass().getSimpleName());
        short b = (byte) i;
        System.out.println("Data type: " + ((Object) b).getClass().getSimpleName());
    }
}

class ExplicitIntChar {
    public static void main(String[] args) {
        int i = 90;
        System.out.println("Data type: " + ((Object) i).getClass().getSimpleName());
        char c = (char) i;
        System.out.println("Data type: " + ((Object) c).getClass().getSimpleName());
        System.out.println(c);
    }
}

class ExplicitFloatLong {
    public static void main(String[] args) {
        float f = 10.0f;
        System.out.println("Data type: " + ((Object) f).getClass().getSimpleName());
        long l = (long) f;
        System.out.println("Data type: " + ((Object) l).getClass().getSimpleName());
        System.out.println(l);
    }
}

class ExplicitDoubleInt {
    public static void main(String[] args) {
        double d = 10.0;
        System.out.println("Data type: " + ((Object) d).getClass().getSimpleName());
        int i = (int) d;
        System.out.println("Data type: " + ((Object) i).getClass().getSimpleName());
        System.out.println(i);
    }
}

class IntDouble {
    public static void main(String[] args) {
        int i = 10;
        double d = i; // or
        double p = (double) i;
        System.out.println(d);
        System.out.println(p);
    }
}

// Practise on iterative statements

/*
 * Question for sum of n natual number
 */
class NaturalNumberSum {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

/*
 * Question for factorial code
 */
class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int prod = 1;
        for (int i = n; i > 0; i--) {
            prod = prod * i;
        }
        System.out.println(prod);
    }
}

/*
 * Question for showing multiplication table for given number
 */
class MultiplicationTable {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}

/*
 * Rght Angle Triangle Pattern
 */
class RightAngleTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class RightAngleTriangleNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for(int j = 1 ;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class RightAngleTriangleNumber_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for(int j = 1 ;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
