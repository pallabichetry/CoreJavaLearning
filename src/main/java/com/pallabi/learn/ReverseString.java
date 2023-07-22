package com.pallabi.learn;

public class ReverseString {

    public static void main(String[] args) {
        // Reverse a String and make string lower case
        String a = "Pallabi Chetry";

        String[] aa = a.split("");

        for (int i = aa.length -1 ; i >= 0; i--) {
            System.out.print(aa[i].toLowerCase());
        }

        System.out.println();
        //make the string lower case
        for(int index = 0; index<=aa.length-1; index++){
            System.out.print(aa[index].toLowerCase());
        }

    }
}
