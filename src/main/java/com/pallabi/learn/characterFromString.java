package com.pallabi.learn;

public class characterFromString {


    public static void main(String[] args) {
        String str = "Pallabi";
        int index = 0;
        System.out.println(charAtString(str,5));



        while (index<str.length()) {
            if(str.charAt(index) == 'a' || str.charAt(index) == 'e'){

                System.out.println(str.charAt(index));
            }
            index++;
        }
    }

    public static char charAtString(String str, int index){
        System.out.println("the character at"+ index+ " "+"is"+" "+str.charAt(index));
        return 0;
    }

}