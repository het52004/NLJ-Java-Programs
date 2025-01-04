package student;

public class StudentData {
    int rollNo;
    String name;
    public void setStudentData(int r, String n) {
        rollNo = r;
        name = n;
    }
    public void getStudentData() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}
