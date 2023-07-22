package com.pallabi.learn;

public class TestPall {

    static int i = 10;
    int j = 10;

    static void print(){
        i = 40;
        System.out.println(i);
    }

    public void print2(){
        i = 30;
        System.out.println(i);
    }

}


class ABC {

    public static void main(String[] args) {

        TestPall a = new TestPall();
        TestPall b = new TestPall();

        TestPall.i = 1000;
        a.print2();
        b.print2();
        TestPall.print();



    }

}