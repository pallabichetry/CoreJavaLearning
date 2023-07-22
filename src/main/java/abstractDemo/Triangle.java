package abstractDemo;

public class Triangle extends Shape{
    private int base;
    private int height;
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int base, int height, int side1, int side2, int side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    @Override
    public void calculateArea() {
        double area = 0.5*getBase()*getHeight();
        System.out.println("Area of triangle is : "+ area);

    }

    @Override
    public void calculatePerimeter() {
        int perimeter = getSide1()+getSide2()+getSide3();
        System.out.println("Perimeter of triangle is : "+ perimeter);

    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,5,7,8,10);
        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
}
