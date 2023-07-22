package abstractDemo;

public class Deer extends Animal{
    @Override
    public void sound() {
        System.out.println("this is deer sound");
    }

    @Override
    public void eat() {
        System.out.println("Deer is herbivores");
    }

    @Override
    public void sleep() {
        System.out.println("Deer sleeps");
    }

    public static void main(String[] args) {
        Deer deer = new Deer();
        deer.eat();
        deer.sleep();
        deer.sound();

    }
}
