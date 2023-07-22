package com.pallabi.learn;

public class Person extends SuperPerson {
    private String Name;

    public Person(String Name){
        super();
        this.Name = Name;
    }

    public Person(int id, String name) {
        super(id);
        Name = name;
    }

    public String getName(){
        return Name;
    }


    public static void main(String[] args) {
        Person person = new Person(100,"pallabi");
        System.out.println(person.id);

    }
}
