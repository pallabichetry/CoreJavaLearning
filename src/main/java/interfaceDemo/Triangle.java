package interfaceDemo;

public class Triangle implements Shape{

    private float base;
    private float height;

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public void getArea() {
        double area = 0.5*getBase()*getHeight();
        System.out.println("Area of the triangle is : "+ area);

    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(20,5);
        triangle.getArea();
        System.out.println(triangle.getHeight());
    }
}
