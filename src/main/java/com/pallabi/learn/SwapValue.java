package com.pallabi.learn;

public class SwapValue {

    public static void main(String[] args) {

        int x = 20;
        int y = 30;
        System.out.println(x + ","+ y);
        // make y 20

        int z = x ;
        x = y;
        y = z;

        System.out.println(x +","+ y);

        System.out.println( String.valueOf(x) + " " +  String.valueOf(y));

    }

}
