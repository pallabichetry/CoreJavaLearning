package encaptulation;

public class Person {

    private String name;
    private int age;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Pallabi");
        person.setAge(30);
        person.setCountry("India");
        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(person.getCountry());

    }
}
