package interfaceDemo;

public abstract class AdvCalculator implements Calculator{
    @Override
    public void addition(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void subtraction(int a, int b) {
        System.out.println(a-b);
    }

    @Override
    public void multiplication(int a, int b) {
        System.out.println(a*b);
    }

    @Override
    public abstract void division(int a, int b);


}
