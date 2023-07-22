package com.pallabi.learn;

public class Square extends Shape {

    private int length;

    public Square(String color, int length) {
        super(color);
        this.length = length;
    }

    public void area(){
        double area = length*length;
        System.out.println("Area of the given square is"+" "+ area);
    }

    public static void main(String[] args) {
        Square square = new Square( "Yellow", 100);
        square.area();
        square.color();
    }
}
