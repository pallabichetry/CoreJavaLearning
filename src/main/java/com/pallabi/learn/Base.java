package com.pallabi.learn;

public abstract class Base {
    public void fun(){
        System.out.println("Base Constructor Called");

    }

    abstract void myAbstractMethod();

    public static void main(String[] args) {
        Base b = new Base() {
            @Override
            void myAbstractMethod() {
                System.out.println("Hello");
            }
        };

        b.fun();
    }
}


