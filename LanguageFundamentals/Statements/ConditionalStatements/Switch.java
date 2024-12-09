/*
 * If conditional statement is able to check one condition but switch is able to check multiple conditions.
 * 
 * --> In general, we will use "switch" in menu driven applications
 */
class Syntax{
    public static void main(String[] args) {
        int i = 30;
        switch(i)
        {
            case 5:
                System.out.println("five");
                break;
            case 10:
                System.out.println("ten");
                break;
            case 15:
                System.out.println("Fifteen");
                break;
            case 20:
                System.out.println("Twenty");
                break;
            default:
                System.out.println("Number should be 5, 10, 15 or 20");
                break;
        }
    }
}

/*
 * Rules_1
 * --> Switch is able to allow the data types like byte, short, int Data types as parameter.
 *     Note: Switch is able to allow char data type as paramter but switch is not allow boolean.
 *     Note: Switch is able to  allow string data type as parameter from JAVA-7 version onwards
 *           upto JAVA-6 version, switch is unable to allow string parameter.
 */

class BytePramaterRules
{
    public static void main(String[] args) {
        byte b = 10;
        switch(b)
        {
            case 5:
                System.out.println("Five");
                break;
            case 10:
                System.out.println("Ten");
                break;
            case 15:
                System.out.println("Fifteen");
                break;
            default:
                System.out.println("Number shoulb be in between 5, 10 and 15");
                break;
        }
    }
}

class ShortParameterRules
{
    public static void main(String[] args) {
        short s = 5;
        switch (s) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("number should be from 1-5");
                break;
        }
    }
}

class IntParameterRules
{
    public static void main(String[] args) {
        int i = 10;
        switch(i){
            case 5:
                System.out.println("Number is");
                break;
            case 10:
                System.out.println("Number is 10");
                break;
            case 15:
                System.out.println("Number is 15");
                break;
            case 20:
                System.out.println("Number is 20");
                break;
            default:
                System.out.println("Number should be in between 5-20");
                break;
        }
    }
}