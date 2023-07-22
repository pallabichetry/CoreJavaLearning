package encaptulation;

public class Employee {

    private String name;
    private int age;
    private String address;
    private int empId;
    private String dateOfBirth;
    private String companyName;

    public Employee(String name, int age, String address, int empId, String dateOfBirth, String companyName) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.empId = empId;
        this.dateOfBirth = dateOfBirth;
        this.companyName = companyName;
    }

    public Employee(){};

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    //assigning
    public void setName(String name) {
        this.name = name;
    }

    //fetching
    public String getName() {
        return name;
    }

    public void printDetails(){
        System.out.println("Details of employee 1: "+ getName());

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", empId=" + empId +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Employee employee = new Employee();

        System.out.println(employee.toString());
    }
}
