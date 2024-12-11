/*
 * It will be used to bypass flow of execution to outside of the respective loop or outside of respective switch.
 */
class Example {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}

/*
 * If we provide any statement immediately after break statement then that
 * statement is called as unreachable statement where
 * compiler will raise an error.
 */
class Example_1 {
    public static void main(String[] args) {
        System.out.println("Before Loop");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Inside loop, before break");
                break;
                System.out.println("Inside loop, after break");
            }
            System.out.println(i);
        }
        System.out.println("After loop");
    }
}

/*
 * If we write any loop inside the loop is called nested loop, If we provide
 * break statement in nested loop then the provided
 * break statement is available to only nsted loop, not giving any affect to
 * outer loop.
 */
class Example_2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break; // comes out from inside loop not both loop if condition meet
                }
                System.out.println(i + " " + j);
            }
        }
    }
}

/*
 * In above context we want to provide break statement for particular outer loop
 * then we have ti use labelled break statement.
 */
class Example_3 {
    public static void main(String[] args) {
        l1: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break l1; // comes out from inside loop not both loop if condition meet
                }
                System.out.println(i + " " + j);
            }
        }
    }
}