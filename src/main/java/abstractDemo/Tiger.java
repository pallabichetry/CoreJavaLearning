package abstractDemo;

public class Tiger extends Animal {

    @Override
    public void sound() {
        System.out.println("This is the sound of tiger");
    }

    @Override
    public void eat() {
        System.out.println("Tigers are carnivores");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeps");

    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.sound();
        tiger.sleep();
        tiger.eat();
    }
}
