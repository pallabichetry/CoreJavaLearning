package abstractDemo;

public class Circle extends Shape{

    private float radius;
    public Circle(float radius){
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = 3.14*getRadius()*getRadius();
        System.out.println("Area of circle is : "+ area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2*3.14*getRadius();
        System.out.println("Perimeter of circle is : "+ perimeter);
        }

    public static void main(String[] args) {
        Circle circle = new Circle(2.5f);
        circle.calculateArea();
        circle.calculatePerimeter();
        circle.setRadius(2f);
        System.out.println(circle.getRadius());
    }

    }

