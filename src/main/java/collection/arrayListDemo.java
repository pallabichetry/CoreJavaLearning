package collection;

import java.util.ArrayList;

public class arrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        //adding element
        al.add(10);
        al.add(11);
        al.add(12);

        System.out.println(al);

        // adding element at a specific index
        al.add(0,100);

        System.out.println(al);

        //Updating element at a index
        al.set(0,200);

        System.out.println(al);


        //removing element
        al.remove(1);
        System.out.println(al);
        // adding element
        al.add(44);

        // Iterating over element
        for (Integer i : al
             ) {

            System.out.println(i);
        }


        System.out.println(al);

    }




}
