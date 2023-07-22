package com.pallabi.learn;

public class ComparisonCheck {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";

        if ( s1 == s2 ){
            System.out.println("Matching");
        }

        System.out.println(s1.toUpperCase());
        if ( s1.toUpperCase().equals("ABC") ){
            System.out.println("Matching");
        }

        Integer n1 = 100;
        Integer n2 = 100;

        if ( n1 == n2 ) {
            System.out.println("Matching");
        }

    }
}
