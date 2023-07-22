package interfaceDemo;

public class Circle implements Shape{

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        double area = 3.14*getRadius()*getRadius();
        System.out.println("Area of the circle is : "+area);
        }

    public static void main(String[] args) {
        Circle circle = new Circle(23);
        circle.getArea();
    }
    }

