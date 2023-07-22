package com.pallabi.learn;

public class Daughter extends Father{
    String myName;

    public Daughter(String home, String surname, String address, String myName) {
        super(home, surname, address);
        this.myName = myName;
    }

    public void property5(){
        System.out.println("this is daughter's property");
    }

    public static void main(String[] args) {
        Daughter daughter = new Daughter("Candeur","chetry","assam","pallabi");
        System.out.println(daughter.myName);
        daughter.property5();
    }
}
