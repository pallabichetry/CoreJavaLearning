package encaptulation;

public class Circle {

    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float calculateArea(){
        return (float) (3.14*radius*radius);
    }
    public float calculatePerimeter(){
        return (float) (2*3.14*radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(2.5f);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
    }
}
