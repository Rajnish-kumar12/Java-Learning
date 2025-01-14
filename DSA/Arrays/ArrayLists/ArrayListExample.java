/*
 * used for dynamic array.
 */
package DSA.Arrays.ArrayLists;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        /*
         * syntax
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        System.out.println(list);
        System.out.println(list.contains(100));//check the eelement is present or not.
        System.out.println(list.get(0)); // get the item.
        System.out.println(list.set(5, 75)); //set the item at given index
        System.out.println(list);
    }
}