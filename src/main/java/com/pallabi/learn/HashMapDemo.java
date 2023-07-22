package com.pallabi.learn;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
        hm1.put("my",1);
        hm1.put("my",2);
        hm1.put("name", 1);
        //System.out.println(hm1);

        for(String key : hm1.keySet()){
            System.out.println("value is : "+ hm1.get("my"));
            System.out.println(hm1.get("abc"));
        }

    }
}
