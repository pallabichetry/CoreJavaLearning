package encaptulation;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Bhaskar",34,"Bangalore",100,"27-10-1987","JPMC");
        employee.setName("Pallabi");
        employee.printDetails();
        System.out.println(employee.toString());

    }
}
