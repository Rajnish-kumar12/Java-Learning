/*
 * Basic Syntax
 */
class BasicSyntax {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

/*
 * Basic Syntax 1
 */
class BasicSyntax_1 {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
}

/*
 * Some Rules for expression 1
 */

/*
 * Rule 1
 * -----------------
 * In for loop expression 1 is optional.
 */
class Rule_1 {
    public static void main(String[] args) {
        int i = 0;
        for (; i < 6; i++) {
            System.out.println(i);
        }
    }
}

/*
 * Rule 1.1
 * -----------------
 * In for loop we can write any statement like System.out.println("Hello") as
 * expression but it is suggestable to provide loop
 * variable declaration and loop variable initialization.
 */
class Rule_1_1 {
    public static void main(String[] args) {
        int i = 0;
        for (System.out.println("Hello"); i < 6; i++) {
            System.out.println(i);
        }
    }
}

/*
 * Rule 2
 * ----------------
 * In for loop, in exp 1 we have to provide at most one declarative statement, it
 * is not possible to provide more than
 * one declarative statement, otherwise it shows error.
 */
class Rule_2
{
public static void main(String[] args) {
for(int i = 0 && float f = 0.0f;i<10 && f<10.0f;i++ , f++)
System.out.println(i+""+f);
}
}

/*
 * Rule 3
 * ---------
 * In for loop in expression-1 we can provide more than one loop variable
 * declaration and initilization within single declarative
 * statement.
 */
class Rule_3 {
    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 10 && j < 10; i++, j++) {
            System.out.println(i + " " + j);
        }
    }
}

/*
 * Some rules for expression 2
 */
/*
 * Rule 4
 * -------
 * In for loop expression 2 is optional in java application we are able to write
 * for loop without expression 2,
 * if we write for loop without expression 2 then for loop will take true by
 * default, it will make for loop as an infinite loop
 * and it will provide infinite output.
 */
class Rule_4 {
    public static void main(String[] args) {
        for (int i = 0;; i++) {
            System.out.println(i); //Infinite loop
        }
    }
}

/*
 * Rule 5
 * --------
 * In for loop we can write without expre 2 and it is not possible to provide
 * any statement like sop
 * if we want to provide statement, we must provide conditional statement, it
 * must return either true or false.
 */
class Rule_5 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.println(i++);
    }
}

/*
 * Rule 6
 * --------
 * In java, if we provide any statement immediately after infinite loop then
 * that statement is called as unreachable stament, it will not be
 * reached to JVM. when compiler recognizes statement as an unreachable
 * statement then only compiler will raise an error like " unreachable
 * statement ". To decide whether statement is unreachable or not first compiler
 * has to check whether the loop is infinite loop
 * or not, If compiler recognizes the provided loop as an infinite loop then
 * compiler will recognize the followed statement as an
 * unreachable statament and compiler will raise error. To decide whether a loop
 * is an infinite or not first compiler must
 * evaluate the provided conditional expression and it has to identify the
 * result of the provided conditional expression is true.
 * 
 * NOTE: In java, compiler is able to evaluate only constant conditional
 * expression not variable conditional expression.
 * 
 */
class Rule_6 {
    public static void main(String[] args) {
        System.out.println("Before loop");
        for (int i = 0; i <= 0 || i >= 0; i++) {
            System.out.println("inside loop");
        }
        System.out.println("After loop"); // ureachable statment
    }
}

class Rule_6_1 {
    public static void main(String[] args) {
        System.out.println("Before loop");
        for (int i = 0; true; i++) {
            System.out.println("inside loop");
        }
        System.out.println("After loop"); // reachable statment
    }
}

class Rule_6_2 {
    public static void main(String[] args) {
        System.out.println("Before loop");
        for (int i = 0;; i++) // it takes default true in expression 2
        {
            System.out.println("inside loop");
        }
        System.out.println("After loop"); // unreachable statment compilation error
    }
}

class Rule_6_3 {
    public static void main(String[] args) {
        System.out.println("Before loop");
        for (int i = 0; false; i++) {
            System.out.println("inside loop");
        }
        System.out.println("After loop"); // unreachable statment compilation error
    }
}

/*
 * Some Rules for expression 3
 */

/*
 * Rule 7
 * -------
 * In for loop, exp3 is optional, we can write for loop without exp3 and we can write any statment as an expression 3 like
 * sop but it is suggestable to provide loop variable increment or decrement statements as expr3
 * 
 */
class Rule_7
{
    public static void main(String[] args) {
        for(int i =0;i<10;)
        {
            System.out.println(i);
            i=i+1;
        }
    }
}