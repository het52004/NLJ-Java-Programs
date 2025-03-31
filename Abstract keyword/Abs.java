public class Abs {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setData(20, 1, "John");
        s1.getData();
    }
}

abstract class Person {
    int age = 3;
    String name;
    abstract void setData(int age, int rollNo, String name);
    abstract void getData();
}

class Student extends Person {
    int rollNo;
    public void setData(int age, int rollNo, String name) {
        this.age = age;
        this.rollNo = rollNo;
        this.name = name;
    }

    public void getData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
    }
}