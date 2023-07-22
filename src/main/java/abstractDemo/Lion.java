package abstractDemo;

public class Lion extends Animal {

    @Override
    public void sound() {
        System.out.println("this is the sound of lion");
    }

    @Override
    public void eat() {
        System.out.println("Lion eats flesh");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps for 21 hours");

    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.sound();
        lion.sleep();
        lion.eat();
        }
    }

