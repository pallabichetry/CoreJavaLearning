package interfaceDemo;

public class CasioCal extends AdvCalculator{
    @Override
    public void division(int a, int b) {
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        CasioCal casioCal = new CasioCal();
        casioCal.addition(15,20);
        casioCal.subtraction(15,20);
        casioCal.multiplication(14,20);
        casioCal.division(20,4);
    }
}
