package com.pallabi.learn;

public class EvenOrOddNumbers {
    int i;

    public boolean checkNumber(int myNum) {
        i = myNum;
        if (i % 2 == 0) {
           return true;
        } else {
           return false;
        }

    }

    public static void main(String[] args) {
        EvenOrOddNumbers eo = new EvenOrOddNumbers();
        eo.checkNumber(35);
    }

}