package com.pallabi.learn;

public class Rectangle extends Shape{

    int length;
    int breadth;

    public Rectangle(String color, int length, int breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    public void area(){
        double area = length*breadth;
        System.out.println("Area of the given rectangle is"+" "+ area);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Red", 11,13);
        rectangle.area();
        rectangle.color();

    }
}
