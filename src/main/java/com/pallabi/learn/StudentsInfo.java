package com.pallabi.learn;

public class StudentsInfo {
    int id;
    String Name;
    int age;
    String Dept;

    public StudentsInfo(int id,String Name,int age,String Dept) {
        this.id = id;
        this.Name = Name;
        this.age = age;
        this.Dept = Dept;
    }

    public String getName(){
        return Name;
    }

    public String getDept(){
        return Dept;
    }

    public int getId(){
        return id;
    }

    public int getAge(){
        return age;
    }

    public String getStudentsInfo(){
        return ("My name is "+ getName()+"."+"I am "+getAge()+" "+ "years old and I study in"+ " " +getDept()+","+"my id is "+getId());

    }

    public static void main(String[] args) {
        StudentsInfo studentsInfo = new StudentsInfo(100,"Devansh",3,"Mont1");
        System.out.println(studentsInfo.getStudentsInfo());
        //studentsInfo.Name
    }

}




