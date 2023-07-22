package com.pallabi.learn;

public class CircleImpl implements ShapeInterface, AreaInterface {

    private String color;
    private int radius;

    public CircleImpl(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void color() {
        System.out.println("colo is : " + color );


    }

    @Override
    public void area() {
        System.out.println("Area is ::" + 3.14 * radius * radius);
    }



}

class Abc{

    public static void main(String[] args) {
        CircleImpl circle = new CircleImpl("Yellow", 14);
        circle.color();
        circle.area();
        System.out.println(CircleImpl.i);
    }

}