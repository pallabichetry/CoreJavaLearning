package array;

public class Students {
    String name;
    int rollNo;
    public Students(String name,int rollNo) {
        this.name = name;
        this.rollNo = rollNo;

    }
    public static void main(String[] args) {
        String [] studentsList = new String[3];
        studentsList[0] = "Pallabi " + ","+
                "101";
        studentsList[1] = "Bhaskar "+","+ "102";
       // studentsList[2] = new String("Devansh",103);

        for (int i = 0; i<studentsList.length; i++){
            System.out.println(studentsList[i]);
        }
    }
}
