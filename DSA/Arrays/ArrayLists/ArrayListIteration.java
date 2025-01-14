package DSA.Arrays.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIteration {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i<10;i++){
            list.add(input.nextInt());
        }
        System.out.println(list);
        System.out.println(list.get(6));
        input.close();
    }
}