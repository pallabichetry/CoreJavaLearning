package com.pallabi.learn;

public class Shape {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(String color) {
        this.color = color;
    }

    public void color(){
        System.out.println("Colour is :" + color);

     }

    public static void main(String[] args) {
        Shape shape= new Shape("Black");
        shape.color();
    }
}
