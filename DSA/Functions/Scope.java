package DSA.Functions;
public class Scope {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            // int a = 78; Already initialized outside the block in the same method, hence you can't initilized again.
            int c = 99;
            a= 100; //It not creating new it change the exisiting one.
            System.out.println(a); //100
            System.out.println(c);
            //value initialized in this block will remain in the block can't used outside the block
        }
        // System.out.println(c); outside the block scope so error
        System.out.println(a); //100
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}