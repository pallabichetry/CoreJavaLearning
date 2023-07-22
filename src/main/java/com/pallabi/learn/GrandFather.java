package com.pallabi.learn;

public class GrandFather {

    public String home;
    public String surname;

    public GrandFather(String home,String surname){
        this.home = home;
        this.surname = surname;
    }

    public void property1(){
        System.out.println("My grandfather surname is "+ getSurname()+" "+ "and his home is "+" "+getHome());

    }

    public String getHome() {
        return home;
    }

    public String getSurname() {
        return surname;
    }

    private void property2(){
        System.out.println("this is property2");
    }

    public void printDetails(){
        System.out.println("My details are :");

    }
}
