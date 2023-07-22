package interfaceDemo;

public class Rectangle implements Shape{

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public void getArea() {
        double area = length*breadth;
        System.out.println("area of rectangle is : "+area);
        }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(25,25);
        rectangle.getArea();

    }


    }

