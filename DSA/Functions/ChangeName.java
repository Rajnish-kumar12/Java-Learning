package DSA.Functions;
public class ChangeName {

    public static void main(String[] args) {
        String name = "Rajnish";
        change(name);
        System.out.println(name);
    }
    static void change(String naam){
        naam = "rahul"; // here we are creating the new object not changing the object
    }
}