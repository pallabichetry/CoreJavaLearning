package com.pallabi.learn;

public class Son extends Father{

    String Name;

    public Son(String home, String surname, String address, String name) {
        super(home, surname, address);
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void property4() {
        System.out.println("my name is " + " " + getName());
        //return getName();
    }

    public static void main(String[] args) {
        Son son = new Son("Candeur","Chetry","bangalore","devansh");
        son.property1();
        son.property3();
        System.out.println(son.home );
        //System.out.println("My name is "+son.getName()+"."+son.property1()+"My home is "+son.getHome()+" "+"and my home is "+son.getHome()+".");
        son.printDetails();
        son.getHome();
        son.property4();
        //System.out.println(son.property4()+"."+son.property3()+" and"+son.property1());






    }
}
