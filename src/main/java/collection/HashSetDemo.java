package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(6);
        arr.add(5);
        arr.add(9);

//        for(int a : arr){
//            System.out.println(a);
//        }

        HashSet<Integer> hs = new HashSet<>();
        for(int a : arr){
            hs.add(a);
            }

        for(int s : hs){
            System.out.println(s);
        }

    }
}
