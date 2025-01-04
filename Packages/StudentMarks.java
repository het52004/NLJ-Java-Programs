package student;

public class StudentMarks {
    String name;
    int marks1, marks2;
    public void setStudentMarks(String n, int m1, int m2) {
        marks1 = m1;
        marks2 = m2;
        name = n;
    }
    public void getStudentMarks() {
        System.out.println("Name: " + name);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
    }
}
