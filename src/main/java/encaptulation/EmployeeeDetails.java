package encaptulation;

public class EmployeeeDetails {
    private int employeeID;
    private String employeeName;
    private double employeeSalary;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSalary() {
        return String.format("employee salary is %.2f",employeeSalary);
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "EmployeeeDetails{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

    public static void main(String[] args) {
        EmployeeeDetails employeeeDetails = new EmployeeeDetails();
        employeeeDetails.setEmployeeSalary(10000.234d);
        System.out.println(employeeeDetails.getEmployeeSalary());
        System.out.println(employeeeDetails.toString());
    }
}
