package com.pallabi.learn;

import java.util.*;

public class CollectionCheck {

    public static void main(String[] args) {

        System.out.println("<<<<<<<<<<<<<<<<<Hash Set>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // Hasset
        HashSet<String> hs = new HashSet<>();
        hs.add("abc");
        hs.add("abc");
        hs.add("abc");
        hs.add("abc");
        hs.add("bcd");
        hs.add("bcd");
        hs.add("bcd");
        hs.add("cde");
        String gg = "abc";
        hs.add(gg);

        System.out.println(hs.size());

        System.out.println(hs);

        for (String s : hs ) {
            System.out.println(s);

        }

        Iterator<String> itr = hs.iterator();

        while( itr.hasNext() ) {

            System.out.println(itr.next());

        }

        hs.forEach( (x) -> {
            System.out.println(x);
        } );

        System.out.println("<<<<<<<<<<<<<<<<<Linked List>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // Linked List
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(100);
        ll.add(1,600);
        ll.addFirst(200);
        ll.addLast(1000);
        ll.add(400);
        ll.set(1, 60000);

        ll.forEach( (x) -> System.out.println(x));


        System.out.println("<<<<<<<<<<<<<<<<<Array List >>>>>>>>>>>>>>>>>>>>>>>>>>");
        //Array List
        ArrayList<Integer> al = new ArrayList<>();
        al.add(600);
        al.add(300);
        al.add(200);
        al.add(1,9999);
        al.remove(3);
        al.set(2,80000);
        al.forEach( (x) -> {
            System.out.println(x);

        });

        System.out.println("<<<<<<<<<<<<<<<<<Hash Map>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // hash map

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("abc", 100);
        hm.put("abc", 200);
        hm.put("bcd", 300);
        hm.put("fff",5);
        System.out.println(hm);
        hm.remove("fff");
        System.out.println(hm.get("abc"));
        System.out.println(hm.get("fff"));

        hm.forEach( (k,v) -> {
            System.out.println(k + ":" + v);
        });

        for (Map.Entry<String, Integer> entry : hm.entrySet() ) {

            System.out.println( entry.getKey() + ":" + entry.getValue() );

        }


        }

}
