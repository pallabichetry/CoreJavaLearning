package com.pallabi.learn;

public class Circle extends Shape {

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public void area(){
        double area = 3.14*radius*radius;
        System.out.println("Area of the given rectangle is"+" "+ area);


    }

    public static void main(String[] args) {
        Circle circle = new Circle("Green",4);
        circle.area();
        circle.color();

    }
}
