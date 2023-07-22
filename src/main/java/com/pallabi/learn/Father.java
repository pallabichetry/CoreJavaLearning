package com.pallabi.learn;

public class Father extends GrandFather{

    String address;

    public Father(String home, String surname, String address) {
        super(home, surname);
        this.address = address;
    }

    public void property3(){
        System.out.println("my father's address is  "+getAddress());
    }

    public String getAddress() {
        return address;
    }
}
