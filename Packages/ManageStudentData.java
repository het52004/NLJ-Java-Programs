package manager;

import student.StudentData;
import student.StudentMarks;

public class ManageStudentData {
    public static void main(String[] args) {
        StudentData s1 = new StudentData();
        s1.setStudentData(101, "John");
        s1.getStudentData();
        StudentMarks s2 = new StudentMarks();
        s2.setStudentMarks("John", 90, 80);
        s2.getStudentMarks();
    }
}
