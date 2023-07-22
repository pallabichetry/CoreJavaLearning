package com.pallabi.learn;


public class Derived extends Base{


    public void fun(){
        System.out.println("Derived fun method Called");

    }



    public static void main(String[] args) {
       Base b = new Derived();
        b.fun();
        b.myAbstractMethod();
    }

    @Override
    void myAbstractMethod() {
        System.out.println("Derived  method called");
    }


}



