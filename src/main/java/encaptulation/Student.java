package encaptulation;

public class Student {
    private String studentName;
    private int studentId;
    private int grades;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        grades += grade;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.addGrade(100);
        student.addGrade(200);
        student.addGrade(-100);
        System.out.println(student.getGrades());
    }
}
